package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SaludoController {

    // Endpoint básico: GET http://localhost:8080/api/v1/saludo
    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "¡Hola! Bienvenido a la API con Spring Boot.";
    }

    // Endpoint opcional con parámetro: GET http://localhost:8080/api/v1/saludo/personalizado?nombre=Jorge
    @GetMapping("/saludo/personalizado")
    public String obtenerSaludoPersonalizado(@RequestParam(defaultValue = "Usuario") String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido a la API con Spring Boot.";
    }
}