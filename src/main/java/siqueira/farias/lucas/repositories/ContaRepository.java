package siqueira.farias.lucas.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import siqueira.farias.lucas.entities.ContaEntity;

import java.util.Optional;

@ApplicationScoped
@Transactional
public class ContaRepository implements PanacheRepository<ContaEntity> {
    public Optional<ContaEntity> findByNumeroConta(Long numeroConta) {
        return find("numeroConta", numeroConta).firstResultOptional();
    }
}
