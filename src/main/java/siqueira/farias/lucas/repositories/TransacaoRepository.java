package siqueira.farias.lucas.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import siqueira.farias.lucas.entities.ContaEntity;
import siqueira.farias.lucas.entities.TransacaoEntity;

import java.util.Optional;

@ApplicationScoped
@Transactional
public class TransacaoRepository implements PanacheRepository<TransacaoEntity> {

}
