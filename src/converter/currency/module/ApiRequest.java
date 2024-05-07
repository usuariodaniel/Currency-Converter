package converter.currency.module;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {

    public ConverterData currencyConverter(String firstCurrency, String secondCurrency){
        URI adress = URI.create("https://v6.exchangerate-api.com/v6/63ab09d19512ed54e4e39a49/pair/" + firstCurrency + "/" + secondCurrency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConverterData.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao obter os dados do API");
        }
    }
}
