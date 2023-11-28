package com.itau.CSTB.model.response;

import java.math.BigDecimal;

public record TransferenciaResponse(String nomeCompletoOrigem, String nomeCompletoDestino, BigDecimal valor) {
}
