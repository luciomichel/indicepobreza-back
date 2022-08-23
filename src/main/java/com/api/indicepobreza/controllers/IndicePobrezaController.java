package com.api.indicepobreza.controllers;


import com.api.indicepobreza.dtos.indicepobreza.Root;
import com.api.indicepobreza.services.IndicePobrezaService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/indice-pobreza")
@Api(value = "Indice de Probeza", produces = MediaType.APPLICATION_JSON_VALUE, tags = {"indice-pobreza-controller"}, description = "Retorna dados do Banco Mundial referente ao indice de pobreza nos paises")
public class IndicePobrezaController {

    final IndicePobrezaService indicePobrezaService;

    public IndicePobrezaController(IndicePobrezaService indicePobrezaService) {
        this.indicePobrezaService = indicePobrezaService;
    }

    @GetMapping
    public Root GetValues(@RequestParam String pais){
        return indicePobrezaService.GetData(pais);
    }
}
