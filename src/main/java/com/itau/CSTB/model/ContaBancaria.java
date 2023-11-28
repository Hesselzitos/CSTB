package com.itau.CSTB.model;

import java.math.BigDecimal;
import java.util.UUID;

public class ContaBancaria {

    private UUID cliente;
    private boolean contaAtiva;
    private BigDecimal saldo;

    public ContaBancaria(UUID cliente, boolean contaAtiva) {
        this.cliente = cliente;
        this.contaAtiva = contaAtiva;
    }

    public ContaBancaria(UUID cliente, BigDecimal saldo) {
        this.saldo = saldo;
    }

    public UUID getCliente() {
        return cliente;
    }

    public void setCliente(UUID cliente) {
        this.cliente = cliente;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
