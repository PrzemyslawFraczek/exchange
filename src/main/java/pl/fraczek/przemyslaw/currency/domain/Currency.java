package pl.fraczek.przemyslaw.currency.domain;

import lombok.Data;
import org.springframework.stereotype.Component;
import pl.fraczek.przemyslaw.currency.domain.dto.CurrencyDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data

public class Currency {
    @Id
    @GeneratedValue
    private Long id;
    private String table;
    private String currency;
    private Code code;
    private Rate[] rates;

    public Currency() {
    }

    public Currency(String currency, Code code, Rate[] rates) {
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }
    public CurrencyDto asDto(){
        return new CurrencyDto(currency,code,rates);
    }
}
