package com.itau.CSTB.integration;

import java.util.Random;

import com.itau.CSTB.model.response.TransferenciaResponse;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class Bacen {
    public HttpServletResponse postTransferencia(TransferenciaResponse transferencia) {
        HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(null);

        /* 10 % de chance de retornar um 429 do bacen */
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1);
        if (randomInt == 9)
            responseWrapper.setStatus(429);
        else
            responseWrapper.setStatus(201);

        return responseWrapper;
    }
}
