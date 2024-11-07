package models;

import java.util.Map;

public class Coin {
    private String base;
    private Map<String, Double> conversion_rates;

    public Coin(String base, Map<String, Double> rates) {
        this.base = base;
        this.conversion_rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return conversion_rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.conversion_rates = rates;
    }
}
