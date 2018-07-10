package pl.fraczek.przemyslaw.operations.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fraczek.przemyslaw.operations.domain.dto.OperationDto;
import pl.fraczek.przemyslaw.operations.reposytory.OperationRepository;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class OperationService {
    @Autowired
    private OperationRepository repository;

    public Long create(OperationDto operationDto) {
        Operation operation = new Operation
                (operationDto.getValue(), operationDto.getCurrencyFrom(),
                 operationDto.getCurrencyTo(), operationDto.getResult(), Date.valueOf(LocalDate.now()));

        Operation operation1 = repository.add(operation);

        return operation1.getId();
    }

    public OperationDto get(Long id) {
        return repository.get(id).asDto();
    }
}
