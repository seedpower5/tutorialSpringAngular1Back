package com.jorge.tutorial1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {
    @RequestMapping("/")
    public  String Saludo()
    {
        return  "hola es un saludo";
    }
}
