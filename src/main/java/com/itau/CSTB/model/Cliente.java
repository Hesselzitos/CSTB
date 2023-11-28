package com.itau.CSTB.model;

import java.util.UUID;

public class Cliente {
    private UUID IDcliente;
    private String nomeCompleto;

    public Cliente(UUID iDcliente, String nomeCompleto) {
        IDcliente = iDcliente;
        this.nomeCompleto = nomeCompleto;
    }

    public UUID getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(UUID iDcliente) {
        IDcliente = iDcliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
