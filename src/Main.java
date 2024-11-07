import api.ApiService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import models.Coin;
import services.CoinService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ApiService apiService = new ApiService();
        CoinService converterService = new CoinService(apiService);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad:");
        double amount = scanner.nextDouble();

        System.out.println("Ingrese la moneda de origen (por ejemplo, USD):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Ingrese la moneda de destino (por ejemplo, EUR):");
        String toCurrency = scanner.next().toUpperCase();

        double result = converterService.convertCoin(amount, fromCurrency, toCurrency);
        System.out.println("Monto convertido: " + result + " " + toCurrency);
    }
}