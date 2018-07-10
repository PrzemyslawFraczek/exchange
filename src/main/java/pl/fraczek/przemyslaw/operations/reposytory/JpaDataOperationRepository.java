package pl.fraczek.przemyslaw.operations.reposytory;

import org.springframework.stereotype.Repository;
import pl.fraczek.przemyslaw.operations.domain.Operation;

@Repository
public class JpaDataOperationRepository implements OperationRepository {
    private final CrudJpaOperationRepository repository;

    public JpaDataOperationRepository(CrudJpaOperationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Operation add(Operation operation) {
        return repository.save(operation);
    }

    @Override
    public Operation get(Long id) {
        return repository.findOne(id);
    }
}
