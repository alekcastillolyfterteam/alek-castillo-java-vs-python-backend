package com.ejemplo.cursos;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Endpoint GET /api/cursos con Spring Boot.
// Para leerlo hace falta entender: anotaciones, inyección de dependencias,
// capa de servicio y DTOs.
@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService servicio;

    public CursoController(CursoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<CursoDTO> listar() {
        return servicio.listarActivos();
    }
}
