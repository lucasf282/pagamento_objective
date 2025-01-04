package siqueira.farias.lucas.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import siqueira.farias.lucas.entities.ContaEntity;

public class ContaDTO {

    @NotNull(message = "{conta.numeroConta.notNull}")
    @Positive(message = "{conta.numeroConta.positive}")
    private Long numeroConta;

    @NotNull(message = "{conta.saldo.notNull}")
    @PositiveOrZero(message = "{conta.saldo.positiveOrZero}")
    private Float saldo;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public ContaEntity toEntity() {
        ContaEntity entity = new ContaEntity();
        entity.setNumeroConta(numeroConta);
        entity.setSaldo(saldo);
        return entity;
    }
}