package com.api.indicepobreza.controllers;

import com.api.indicepobreza.dtos.paises.Root;
import com.api.indicepobreza.services.PaisesService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/paises")
@Api(value = "Paises", produces = MediaType.APPLICATION_JSON_VALUE, tags = {"paises-controller"}, description = "Retorna lista de paises cadastrados no indice de pobreza")
public class PaisesController {

    final PaisesService paisesService;

    public PaisesController(PaisesService paisesService) {
        this.paisesService = paisesService;
    }

    @GetMapping
    public Root GetValues(){
        return paisesService.GetData();
    }
}
