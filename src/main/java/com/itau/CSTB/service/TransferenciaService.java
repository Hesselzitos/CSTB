package com.itau.CSTB.service;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.itau.CSTB.model.response.TransferenciaResponse;

@Service
public class TransferenciaService {
    public static TransferenciaResponse transferencia(UUID clienteOrigem, UUID clienteDestino, BigDecimal valor) {
        

        return new TransferenciaResponse("Joaquim", "Cleiton", BigDecimal.ZERO);
    }

}
