package pl.fraczek.przemyslaw.currency.domain;

public interface CurrencyRepository {
    Currency get(Code code);
}
