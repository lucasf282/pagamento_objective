package siqueira.farias.lucas.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.ws.rs.NotFoundException;
import siqueira.farias.lucas.utils.MessageUtil;

import java.util.Arrays;

public enum FormaPagamentoEnum {
    PIX("P", "PIX"),
    CARTAO_CREDITO("C", "Cartão de Crédito"),
    CARTAO_DEBITO("D", "Cartão de Débito");

    private String descricao;
    private String sigla;

    FormaPagamentoEnum(String sigla, String descricao) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSigla() {
        return sigla;
    }

    @JsonCreator
    public static FormaPagamentoEnum getBySigla(String sigla) {
        return Arrays.stream(FormaPagamentoEnum.values())
                .filter(formaPagamentoEnum -> formaPagamentoEnum.getSigla().equalsIgnoreCase(sigla))
                .findFirst()
                .orElseThrow(() -> new NotFoundException(MessageUtil.getMessage("formaPagamento.notFound")));
    }


}
