package com.itau.CSTB.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;

@DynamoDBTable(tableName = "ContaBancaria")
public class ContaBancaria implements Serializable {

    private static final long serialVersionUID = -4282005207341771716L;

    @Id
    @DynamoDBHashKey(attributeName = "IDcliente")
    @DynamoDBAttribute(attributeName = "contaAtiva")
    private UUID IDcliente;

    @DynamoDBAttribute(attributeName = "contaAtiva")
    @JsonProperty("contaAtiva")
    private boolean contaAtiva;

    @DynamoDBAttribute(attributeName = "saldo")
    @JsonProperty("saldo")
    private BigDecimal saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(UUID cliente, boolean contaAtiva, BigDecimal saldo) {
        this.IDcliente = cliente;
        this.contaAtiva = contaAtiva;
        this.saldo = saldo;
    }

    public UUID getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(UUID cliente) {
        this.IDcliente = cliente;
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
