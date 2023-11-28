package com.itau.CSTB.model.response;

import java.math.BigDecimal;
import java.util.UUID;

public record ConsultaSaldoResponse(UUID cliente, BigDecimal saldo) {
}
