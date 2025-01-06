package siqueira.farias.lucas.factories;

import siqueira.farias.lucas.enums.FormaPagamentoEnum;
import siqueira.farias.lucas.strategies.pagamentos.*;

public class PagamentoFactory {

    public static PagamentoStrategy getPagamentoStrategy(FormaPagamentoEnum formaPagamento) {
        switch (formaPagamento) {
            case CARTAO_CREDITO:
                return new PagamentoCartaoCredito();
            case CARTAO_DEBITO:
                return new PagamentoCartaoDebito();
            case PIX:
                return new PagamentoPix();
            default:
                throw new IllegalArgumentException("Forma de pagamento não suportada: " + formaPagamento);
        }
    }
}