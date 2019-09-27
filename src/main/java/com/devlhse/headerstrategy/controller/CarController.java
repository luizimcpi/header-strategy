package com.devlhse.headerstrategy.controller;

import com.devlhse.headerstrategy.enuns.CarVersion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    public Mono<OrderResponse> getCar(@RequestHeader("X-version") CarVersion version){
        LOG.info("Solicitação de simulação recebida - orderUuid: [{}]", orderUuid);

        return routerService.simulate(version,tokenAuthentication, orderUuid)
                .doOnSuccess(response -> LOG.info("Resposta da simulação: [{}] com o orderUuid: [{}]", response, orderUuid))
                .doOnError(error -> LOG.error("Ocorreu um erro ao efetuar a simulação com orderUuid: [{}] - Erro: [{}]", orderUuid, error));
    }

}
