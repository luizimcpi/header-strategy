package com.devlhse.headerstrategy.service;

import com.devlhse.headerstrategy.model.CarResponse;
import org.springframework.stereotype.Service;

@Service
public class CarServiceV2 extends CarVersionService {

    @Override
    public CarResponse getCar() {
        return new CarResponse.Builder().name("car version 2").build();
    }

}
