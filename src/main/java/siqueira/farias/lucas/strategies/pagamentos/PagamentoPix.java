package siqueira.farias.lucas.strategies.pagamentos;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public float calcularTaxa(float valor) {
        return 0f;
    }
}
