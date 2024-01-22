package com.jorge.tutorial1.gestionEmpleadosController;


import com.jorge.tutorial1.gestionEmpleadosModel.Empleado;
import com.jorge.tutorial1.gestionEmpleadosRepository.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")

public class EmpleadoControlador {
    @Autowired
    private EmpleadoRepositorio repositorio;

    // Método para listar todos los empleados
    @GetMapping("/empleados")
    public List<Empleado> listaTodosLosEmpleados() {
        return repositorio.findAll();
    }

    // Método para añadir un nuevo empleado
    @PostMapping("/empleados")
    public Empleado aniadirEmpleado(@RequestBody Empleado nuevoEmpleado) {
        // Guardar el nuevo empleado en la base de datos
        return repositorio.save(nuevoEmpleado);
    }

    // Método para eliminar un empleado por su id
    @DeleteMapping("/empleados/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        // Verificar si el empleado existe antes de intentar eliminarlo
        if (repositorio.existsById(id)) {
            repositorio.deleteById(id);
        } else {
            // Manejar el caso en el que el empleado no existe
            throw new IllegalArgumentException("Empleado con id " + id + " no encontrado.");
        }
    }
}
