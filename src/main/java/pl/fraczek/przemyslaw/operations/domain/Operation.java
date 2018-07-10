package pl.fraczek.przemyslaw.operations.domain;

import lombok.Getter;
import lombok.Setter;
import pl.fraczek.przemyslaw.currency.domain.Currency;

import pl.fraczek.przemyslaw.operations.domain.dto.OperationDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Operation {
    @Id
    @GeneratedValue
    private Long id;
    private double value  ;
    private Currency currencyFrom;
    private Currency currencyTo;
    private double result;
    private Date date;

    public Operation(double value, Currency currencyFrom, Currency currencyTo, double result, Date date) {
        this.value = value;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.result = result;
        this.date = date;
    }

    public Operation() {
    }

    public Long getId() {
        return id;
    }

    public OperationDto asDto() {
        return new OperationDto(value,currencyFrom,currencyTo);
    }
}
