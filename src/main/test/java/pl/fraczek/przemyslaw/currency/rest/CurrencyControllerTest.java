package pl.fraczek.przemyslaw.currency.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.fraczek.przemyslaw.currency.domain.Code;
import pl.fraczek.przemyslaw.currency.domain.Rate;
import pl.fraczek.przemyslaw.currency.domain.dto.CurrencyDto;

import static junit.framework.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
    public class CurrencyControllerTest {

    @Autowired
    private CurrencyController currencyController;

    @Test
    public void shouldReturnParamCurrency() throws Exception {
        Code code = Code.EUR;
        CurrencyDto currency = currencyController.get(code);

        Rate[] rates = currency.getRates();
        assertEquals("{currency='" + currency.getCurrency() + '\'' +
                ", code=" + currency.getCode() +
                ", rates=" + rates[0].getMid() +
                '}', currency.toString());



    }
}