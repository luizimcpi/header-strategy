package com.devlhse.headerstrategy.controller;

import com.devlhse.headerstrategy.enuns.CarVersion;
import com.devlhse.headerstrategy.model.CarResponse;
import com.devlhse.headerstrategy.service.CarRouterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    public CarResponse getCar(@RequestHeader("X-version") CarVersion version){



        private final CarRouterService routerService;

        return routerService.g(version,tokenAuthentication, orderUuid)
                .doOnSuccess(response -> LOG.info("Resposta da simulação: [{}] com o orderUuid: [{}]", response, orderUuid))
                .doOnError(error -> LOG.error("Ocorreu um erro ao efetuar a simulação com orderUuid: [{}] - Erro: [{}]", orderUuid, error));
    }

}
