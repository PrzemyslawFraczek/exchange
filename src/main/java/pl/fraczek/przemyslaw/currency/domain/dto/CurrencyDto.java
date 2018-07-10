package pl.fraczek.przemyslaw.currency.domain.dto;

import pl.fraczek.przemyslaw.currency.domain.Code;
import pl.fraczek.przemyslaw.currency.domain.Rate;

import java.util.Arrays;


public class CurrencyDto {
    private String currency;
    private Code code;
    private Rate[] rates;

    public CurrencyDto() {
    }

    public CurrencyDto(String currency, Code code, Rate[] rates) {
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String getCurrency() {
        return currency;
    }

    public Code getCode() {
        return code;
    }

    public Rate[] getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return  "{currency='" + currency + '\'' +
                ", code=" + code +
                ", rates=" + rates[0].getMid() +
                '}';
    }
}
