package pl.fraczek.przemyslaw.currency.domain;

import org.springframework.stereotype.Repository;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
@Repository
public class RestClientRepository implements CurrencyRepository {

    private Client client = ClientBuilder.newClient();

    @Override
    public Currency get(Code code) {
        String URL = "http://api.nbp.pl/api/exchangerates/rates/a/" + String.valueOf(code) + "?format=json";

        return client
                .target(URL)
                .request(MediaType.APPLICATION_JSON)
                .get(Currency.class);
    }
}
