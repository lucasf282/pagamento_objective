package siqueira.farias.lucas.converters;

import siqueira.farias.lucas.dtos.TransacaoDTO;
import siqueira.farias.lucas.entities.TransacaoEntity;
import siqueira.farias.lucas.enums.FormaPagamentoEnum;

public class TransacaoConverter {

    public static TransacaoEntity toEntity(TransacaoDTO dto) {
        TransacaoEntity entity = new TransacaoEntity();
        entity.setNumeroConta(dto.getNumeroConta());
        entity.setFormaPagamento(dto.getFormaPagamento().getSigla());
        entity.setValor(dto.getValor());
        return entity;
    }
}
