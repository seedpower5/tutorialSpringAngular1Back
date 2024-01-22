package com.jorge.tutorial1.gestionEmpleadosRepository;

import com.jorge.tutorial1.gestionEmpleadosModel.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Long>
{

}
