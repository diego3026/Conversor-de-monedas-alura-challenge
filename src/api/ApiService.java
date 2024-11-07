package api;

import com.google.gson.Gson;
import models.Coin;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private final String apiUrlTemplate = "https://v6.exchangerate-api.com/v6/e28a82ddb216f3c6b9a08ce5/latest/%s";
    private Gson gson = new Gson();
    private final HttpClient httpClient = HttpClient.newHttpClient();

    public double fetchExchangeRate(String fromCurrency, String toCurrency) {
        try {
            String apiUrl = String.format(apiUrlTemplate, fromCurrency);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la conexión: Código de respuesta " + response.statusCode());
            }

            Coin coin = gson.fromJson(response.body(), Coin.class);

            return coin.getRates().getOrDefault(toCurrency, 0.0);

        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
