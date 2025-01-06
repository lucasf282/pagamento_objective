package siqueira.farias.lucas.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ContaDTO {

    @NotNull(message = "{conta.numeroConta.notNull}")
    @Positive(message = "{conta.numeroConta.positive}")
    private Long numeroConta;

    @NotNull(message = "{conta.saldo.notNull}")
    @PositiveOrZero(message = "{conta.saldo.positiveOrZero}")
    private float saldo;

    @JsonProperty("numero_conta")
    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}