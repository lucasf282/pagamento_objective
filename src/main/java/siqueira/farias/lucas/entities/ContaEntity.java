package siqueira.farias.lucas.entities;

import jakarta.persistence.*;

@Entity
@Table(
        name="conta",
        uniqueConstraints=@UniqueConstraint(columnNames={"numero_conta"})
)
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_conta")
    private Long numeroConta;
    private  float saldo;

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
