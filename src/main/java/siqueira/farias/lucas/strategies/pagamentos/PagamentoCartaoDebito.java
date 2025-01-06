package siqueira.farias.lucas.strategies.pagamentos;

public class PagamentoCartaoDebito implements PagamentoStrategy {
    @Override
    public float calcularTaxa(float valor) {
        return valor * 0.03f;
    }
}
