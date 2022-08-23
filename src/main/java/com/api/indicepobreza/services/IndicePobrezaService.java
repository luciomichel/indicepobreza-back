package com.api.indicepobreza.services;

import com.api.indicepobreza.dtos.indicepobreza.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndicePobrezaService {


    public IndicePobrezaService() {
    }

    public Root GetData(String country){

        RestTemplate restTemplate = new RestTemplate();
        try {
            final HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            headers.set("Accept", "application/json");

            final HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<Object> response = restTemplate.exchange("http://api.worldbank.org/v2/country/" + country + "/indicator/SI.POV.DDAY?format=json", HttpMethod.GET, entity, Object.class);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String JSONObject = gson.toJson(response.getBody());

            String data = "{\"Indicadores\":" + JSONObject.substring(133, JSONObject.length() - 1) + " }";

            ObjectMapper objectMapper = new ObjectMapper();
            Root root = objectMapper.readValue(data, Root.class);

            return root;

        }catch (Exception e){
            String erro = e.getMessage();
            return null;
        }
    }
}
