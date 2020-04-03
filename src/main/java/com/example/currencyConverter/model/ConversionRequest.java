package com.example.currencyConverter.model;

public class ConversionRequest
{
    private String fromCurrency;
    private String toCurrency;
    private String currencyValue;

    public ConversionRequest() {
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

    public String getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    public ConversionRequest(String fromCurrency, String toCurrency, String currencyValue) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.currencyValue = currencyValue;
    }

    @Override
    public String toString() {
        return "ConversionRequest{" +
                "fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", currencyValue='" + currencyValue + '\'' +
                '}';
    }
}
