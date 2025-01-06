package siqueira.farias.lucas.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import siqueira.farias.lucas.enums.FormaPagamentoEnum;
import siqueira.farias.lucas.factories.PagamentoFactory;
import siqueira.farias.lucas.strategies.pagamentos.PagamentoStrategy;

public class TransacaoDTO {

    @NotNull(message = "{conta.numeroConta.notNull}")
    @Positive(message = "{conta.numeroConta.positive}")
    @JsonProperty("numero_conta")
    private Long numeroConta;

    @NotNull(message = "{transacao.valor.notNull}")
    @Positive(message = "{transacao.valor.positive}")
    private float valor;

    @NotNull(message = "{transacao.formaPagamento.notNull}")
    @JsonProperty("forma_pagamento")
    private FormaPagamentoEnum formaPagamento;

    @JsonIgnore
    private PagamentoStrategy pagamentoStrategy;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
        this.pagamentoStrategy = PagamentoFactory.getPagamentoStrategy(this.formaPagamento);
    }

    public PagamentoStrategy getPagamentoStrategy() {
        return pagamentoStrategy;
    }
}