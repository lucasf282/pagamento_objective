package siqueira.farias.lucas.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.ForbiddenException;
import jakarta.ws.rs.NotFoundException;
import siqueira.farias.lucas.converters.ContaConverter;
import siqueira.farias.lucas.dtos.ContaDTO;
import siqueira.farias.lucas.entities.ContaEntity;
import siqueira.farias.lucas.repositories.ContaRepository;
import siqueira.farias.lucas.utils.MessageUtil;

import java.util.Optional;

@ApplicationScoped
public class ContaService {
    @Inject
    private ContaRepository repository;

    public ContaDTO cadastrar(ContaDTO contaDTO) {
        Optional<ContaEntity> conta = repository.findByNumeroConta(contaDTO.getNumeroConta());
        if (conta.isPresent()){
            throw new NotFoundException("Conta já cadastrada");
        } else {
            ContaEntity entity = ContaConverter.toEntity(contaDTO);
            repository.persist(entity);
            return ContaConverter.toDTO(entity);
        }
    }

    public ContaDTO buscar(Long numeroConta) {
        return ContaConverter.toDTO(findByNumeroConta(numeroConta));
    }

    public ContaEntity findByNumeroConta(Long numeroConta) {
        Optional<ContaEntity> conta = repository.findByNumeroConta(numeroConta);
        if (conta.isPresent()){
            return conta.get();
        } else {
            throw new NotFoundException(MessageUtil.getMessage("conta.notFound"));
        }
    }

    public ContaDTO retirarSaldo(Long numeroConta, Float valor) {
        ContaEntity conta = this.findByNumeroConta(numeroConta);
        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            repository.persist(conta);
            return ContaConverter.toDTO(conta);
        } else {
            throw new ForbiddenException(MessageUtil.getMessage("conta.saldoInsuficiente"));
        }
    }

    public Float getSaldoByNumeroConta(Long numeroConta) {
        ContaEntity conta = this.findByNumeroConta(numeroConta);
        return conta.getSaldo();
    }
}
