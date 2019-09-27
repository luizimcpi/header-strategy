package com.devlhse.headerstrategy.service;

import com.devlhse.headerstrategy.model.CarResponse;
import org.springframework.stereotype.Service;

@Service
public class CarServiceV1 extends CarVersionService {

    @Override
    public CarResponse getCar() {
        return new CarResponse.Builder().name("car version 1").build();
    }
}
