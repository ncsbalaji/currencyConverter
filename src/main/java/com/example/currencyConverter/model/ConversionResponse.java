package com.example.currencyConverter.model;

public class ConversionResponse
{

    private String fromCurrency;
    private String toCurrency;
    private String fromCurrencyValue;
    private String toCurrencyValue;

    public ConversionResponse() {
    }

    public ConversionResponse(String fromCurrency, String toCurrency, String fromCurrencyValue, String toCurrencyValue) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.fromCurrencyValue = fromCurrencyValue;
        this.toCurrencyValue = toCurrencyValue;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getFromCurrencyValue() {
        return fromCurrencyValue;
    }

    public void setFromCurrencyValue(String fromCurrencyValue) {
        this.fromCurrencyValue = fromCurrencyValue;
    }

    public String getToCurrencyValue() {
        return toCurrencyValue;
    }

    public void setToCurrencyValue(String toCurrencyValue) {
        this.toCurrencyValue = toCurrencyValue;
    }

    @Override
    public String toString() {
        return "ConversionResponse{" +
                "fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", fromCurrencyValue='" + fromCurrencyValue + '\'' +
                ", toCurrencyValue='" + toCurrencyValue + '\'' +
                '}';
    }
}
