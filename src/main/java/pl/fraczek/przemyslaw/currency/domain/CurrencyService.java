package pl.fraczek.przemyslaw.currency.domain;

import org.springframework.stereotype.Service;
import pl.fraczek.przemyslaw.currency.domain.dto.CurrencyDto;

@Service
public class CurrencyService {

    private final CurrencyRepository repository;

    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public CurrencyDto get(Code code) {
        return repository.get(code).asDto();
    }
}
