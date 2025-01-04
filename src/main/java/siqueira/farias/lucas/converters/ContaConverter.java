package siqueira.farias.lucas.converters;

import siqueira.farias.lucas.dtos.ContaDTO;
import siqueira.farias.lucas.entities.ContaEntity;

public class ContaConverter {
    public static ContaDTO toDTO(ContaEntity entity) {
        ContaDTO dto = new ContaDTO();
        dto.setNumeroConta(entity.getNumeroConta());
        dto.setSaldo(entity.getSaldo());
        return dto;
    }

    public static ContaEntity toEntity(ContaDTO dto) {
        ContaEntity entity = new ContaEntity();
        entity.setNumeroConta(dto.getNumeroConta());
        entity.setSaldo(dto.getSaldo());
        return entity;
    }
}
