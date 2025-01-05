package siqueira.farias.lucas.entities;

import jakarta.persistence.*;
import siqueira.farias.lucas.enums.FormaPagamentoEnum;

@Entity
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_conta")
    private Long numeroConta;
    private  Float valor;
    @Column(name = "forma_pagamento")
    private String formaPagamento;

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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
