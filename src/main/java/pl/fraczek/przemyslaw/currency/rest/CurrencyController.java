package pl.fraczek.przemyslaw.currency.rest;

import org.springframework.web.bind.annotation.*;
import pl.fraczek.przemyslaw.currency.domain.Code;
import pl.fraczek.przemyslaw.currency.domain.CurrencyService;
import pl.fraczek.przemyslaw.currency.domain.dto.CurrencyDto;


@RestController
@RequestMapping("/currency")
public class CurrencyController {

private CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public CurrencyDto get(@PathVariable Code code){
        return service.get(code);
    }

}
