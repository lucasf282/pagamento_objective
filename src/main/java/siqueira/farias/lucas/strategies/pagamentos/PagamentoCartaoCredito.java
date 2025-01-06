package siqueira.farias.lucas.strategies.pagamentos;

public class PagamentoCartaoCredito implements PagamentoStrategy {
    @Override
    public float calcularTaxa(float valor) {
        return valor * 0.05f;
    }
}
