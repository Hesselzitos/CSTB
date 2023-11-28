package com.itau.CSTB.integration;

import java.util.UUID;

import com.itau.CSTB.model.Cliente;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class Cadastro {
    public HttpServletResponse getCadastro(UUID idCliente) {

        Cliente cliente = new Cliente(idCliente, "kleitinho");
        HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper((HttpServletResponse) cliente);

        responseWrapper.setStatus(200);

        return responseWrapper;
    }
}
