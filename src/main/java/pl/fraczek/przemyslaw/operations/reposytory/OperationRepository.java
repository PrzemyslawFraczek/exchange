package pl.fraczek.przemyslaw.operations.reposytory;

import org.springframework.data.repository.CrudRepository;

import pl.fraczek.przemyslaw.currency.domain.Currency;
import pl.fraczek.przemyslaw.operations.domain.Operation;


public interface OperationRepository {
    Operation add(Operation operation);

    Operation get(Long id);
}
