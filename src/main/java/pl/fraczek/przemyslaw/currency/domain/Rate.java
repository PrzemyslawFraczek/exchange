package pl.fraczek.przemyslaw.currency.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Rate {
    private String no;
    private String effectiveDate;
    private double mid;
}
