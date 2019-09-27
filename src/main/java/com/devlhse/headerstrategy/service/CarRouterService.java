package com.devlhse.headerstrategy.service;

import com.devlhse.headerstrategy.enuns.CarVersion;
import com.devlhse.headerstrategy.model.CarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.Map;

@Service
public class CarRouterService {

    private final Map<CarVersion, CarVersionService> carServices = new EnumMap<CarVersion, CarVersionService>(CarVersion.class);

    @Autowired
    public CarRouterService(CarServiceV1 carServiceV1, CarServiceV2 carServiceV2) {
        this.carServices.put(CarVersion.v1, carServiceV1);
        this.carServices.put(CarVersion.v2, carServiceV2);
    }

    public CarResponse getCar(CarVersion version){
        return carServices.get(version).getCar();
    }
}
