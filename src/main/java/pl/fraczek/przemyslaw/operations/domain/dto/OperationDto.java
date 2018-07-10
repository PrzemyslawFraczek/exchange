package pl.fraczek.przemyslaw.operations.domain.dto;

import pl.fraczek.przemyslaw.currency.domain.Currency;
import pl.fraczek.przemyslaw.currency.domain.Rate;

public class OperationDto {
    private double value;
    private Currency currencyFrom;
    private Currency currencyTo;


    public OperationDto(double value, Currency currencyFrom, Currency currencyTo) {
        this.value = value;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;


    }

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public double getValue() {
        return value;
    }

    public double getResult() {
        final Rate[] ratesFrom = currencyFrom.getRates();
        final double midFrom = ratesFrom[0].getMid();

        final Rate[] ratesTo = currencyTo.getRates();
        final double midTo = ratesTo[0].getMid();

        return (midFrom * value)/midTo;

    }
}
