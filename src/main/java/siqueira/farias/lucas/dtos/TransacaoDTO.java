package siqueira.farias.lucas.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import siqueira.farias.lucas.enums.FormaPagamentoEnum;

public class TransacaoDTO {

    @NotNull(message = "{conta.numeroConta.notNull}")
    @Positive(message = "{conta.numeroConta.positive}")
    @JsonProperty("numero_conta")
    private Long numeroConta;

    @NotNull(message = "{transacao.valor.notNull}")
    @Positive(message = "{transacao.valor.positive}")
    private Float valor;

    @NotNull(message = "{transacao.formaPagamento.notNull}")
    @JsonProperty("forma_pagamento")
    private FormaPagamentoEnum formaPagamento;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}