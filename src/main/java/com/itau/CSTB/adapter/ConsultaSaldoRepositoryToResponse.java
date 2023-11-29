package com.itau.CSTB.adapter;

import com.itau.CSTB.model.ContaBancaria;
import com.itau.CSTB.model.response.ConsultaSaldoResponse;

public class ConsultaSaldoRepositoryToResponse {
    public ConsultaSaldoResponse adapter(ContaBancaria contaBancaria) {
        return new ConsultaSaldoResponse(contaBancaria.getIDcliente(), contaBancaria.getSaldo());
        
    }
}
