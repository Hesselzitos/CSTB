package com.itau.CSTB.service;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.itau.CSTB.model.ContaBancaria;
import com.itau.CSTB.model.response.ConsultaSaldoResponse;

@Service
public class ContaBancariaService {
    public static ConsultaSaldoResponse consultaSaldo(UUID cliente) {
        /*
         * 1. consultar no banco de dados
         * 2. conta ativa?
         * 2.1. Se sim, responder adapter.ConsultaSaldoResponse(contabancaria)
         * 2.2. Se nao, badRequest
         * 
         */
        return new ConsultaSaldoResponse(cliente, BigDecimal.ZERO);
    }

    public ContaBancaria consultaCompleta(UUID cliente) {
        return new ContaBancaria(cliente, BigDecimal.ZERO);
    }
}
