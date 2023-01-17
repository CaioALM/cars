package com.cars.api.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")

public class CarController {

    @PostMapping
    public void create( @RequestBody CarDTO req) {

    System.out.println(req.modelo());
    System.out.println(req.valor());

    }
}
