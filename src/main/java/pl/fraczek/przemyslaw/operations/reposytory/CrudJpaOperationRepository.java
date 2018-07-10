package pl.fraczek.przemyslaw.operations.reposytory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.fraczek.przemyslaw.operations.domain.Operation;

@Repository
public interface CrudJpaOperationRepository extends CrudRepository<Operation , Long> {
}
