package siqueira.farias.lucas.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import siqueira.farias.lucas.converters.ContaConverter;
import siqueira.farias.lucas.dtos.ContaDTO;
import siqueira.farias.lucas.entities.ContaEntity;
import siqueira.farias.lucas.repositories.ContaRepository;

import java.util.Optional;

@ApplicationScoped
public class ContaService {
    @Inject
    ContaRepository repository;
    public ContaDTO cadastrar(ContaDTO contaDTO) {
        Optional<ContaEntity> conta = repository.findByNumeroConta(contaDTO.getNumeroConta());
        if (conta.isPresent()){
            throw new RuntimeException("Conta já cadastrada");
        } else {
            ContaEntity entity = ContaConverter.toEntity(contaDTO);
            repository.persist(entity);
            return ContaConverter.toDTO(entity);
        }
    }
}
