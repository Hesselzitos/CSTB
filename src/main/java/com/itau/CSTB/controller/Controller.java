package com.itau.CSTB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itau.CSTB.model.response.ConsultaSaldoResponse;
import com.itau.CSTB.model.response.TransferenciaResponse;
import com.itau.CSTB.service.ContaBancariaService;
import com.itau.CSTB.service.TransferenciaService;

import java.util.UUID;
import java.math.BigDecimal;

@RestController
public class Controller {

    @GetMapping("/saldo")
    public ConsultaSaldoResponse saldo(@RequestParam(value = "cliente", defaultValue = "null") UUID cliente) {
        return ContaBancariaService.consultaSaldo(cliente);
    }

    @PostMapping("/transferencia")
    public TransferenciaResponse transferencia(
            @RequestBody UUID clienteOrigem,
            UUID clienteDestino, BigDecimal valor) {
        return TransferenciaService.transferencia(clienteOrigem, clienteDestino, valor);
    }
}
