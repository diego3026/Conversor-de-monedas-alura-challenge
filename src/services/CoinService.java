package services;

import api.ApiService;

public class CoinService {
    private final ApiService apiService;

    public CoinService(ApiService apiService) {
        this.apiService = apiService;
    }

    public double convertCoin(double amount, String fromCurrency, String toCurrency) {
        double rate = apiService.fetchExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
