package com.devlhse.headerstrategy.controller;

import com.devlhse.headerstrategy.enuns.CarVersion;
import com.devlhse.headerstrategy.model.CarResponse;
import com.devlhse.headerstrategy.service.CarRouterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    private final CarRouterService routerService;

    @Autowired
    public CarController(CarRouterService routerService) {
        this.routerService = routerService;
    }

    @ResponseStatus(value = OK)
    @GetMapping("/cars")
    public CarResponse getCar(@RequestHeader("X-version") CarVersion version){
        return routerService.getCar(version);
    }

}
