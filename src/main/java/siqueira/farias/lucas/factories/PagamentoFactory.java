package siqueira.farias.lucas.factories;

import siqueira.farias.lucas.enums.FormaPagamentoEnum;
import siqueira.farias.lucas.strategies.pagamentos.*;
import siqueira.farias.lucas.utils.MessageUtil;

public class PagamentoFactory {

    public static PagamentoStrategy getPagamentoStrategy(FormaPagamentoEnum formaPagamento) {
        return switch (formaPagamento) {
            case CARTAO_CREDITO -> new PagamentoCartaoCredito();
            case CARTAO_DEBITO -> new PagamentoCartaoDebito();
            case PIX -> new PagamentoPix();
            default -> throw new IllegalArgumentException(MessageUtil.getMessage("formaPagamento.notFound"));
        };
    }
}