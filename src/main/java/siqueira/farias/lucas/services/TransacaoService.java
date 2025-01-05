package siqueira.farias.lucas.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import siqueira.farias.lucas.converters.TransacaoConverter;
import siqueira.farias.lucas.dtos.ContaDTO;
import siqueira.farias.lucas.dtos.TransacaoDTO;
import siqueira.farias.lucas.repositories.TransacaoRepository;

@ApplicationScoped
public class TransacaoService {
    @Inject
    private TransacaoRepository repository;

    @Inject
    private ContaService contaService;

    @Transactional
    public ContaDTO pagar(TransacaoDTO transacaoDTO) {
            ContaDTO conta = contaService.retirarSaldo(transacaoDTO.getNumeroConta(), transacaoDTO.getValor());
            repository.persist(TransacaoConverter.toEntity(transacaoDTO));
            return conta;
    }

}
