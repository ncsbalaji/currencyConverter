package com.example.currencyConverter.services;


import com.example.currencyConverter.model.ConversionRequest;
import com.example.currencyConverter.model.ConversionResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.ws.rs.Produces;
import java.util.List;

@RestController
@RequestMapping("/converter/")
public class CurrencyRestController
{
    @Value("${DollarToInr}")
    private String dollarToInrValue;

    @PostMapping("/currency")
    @Produces("application/json")
    public ConversionResponse convert(@Valid @RequestBody ConversionRequest request)
    {
        System.out.println("Request :"+request.toString());
        double conversionFactor = 0;
        double toCurrencyValue = 0;
        try
        {
            if(request.getFromCurrency().equals("dollar"))
            {
                conversionFactor = Double.parseDouble(dollarToInrValue);
            }
            else if(request.getFromCurrency().equals("inr"))
            {
                conversionFactor = (1/Double.parseDouble(dollarToInrValue));
            }

            Double fromCurrencyValue = Double.parseDouble(request.getCurrencyValue());
            toCurrencyValue = fromCurrencyValue * conversionFactor;
        }
        catch (Exception exception)
        {
            System.out.println("Exception occured during conversion");
        }



        ConversionResponse response = new ConversionResponse(request.getFromCurrency(), request.getToCurrency(),
                request.getCurrencyValue(), String.valueOf(toCurrencyValue));

        System.out.println("Response :"+response.toString());

        return response;
    }

    @GetMapping("/test")
    public String getAllproduct() {
        return "service is up and running";
    }

    @GetMapping("/greet")
    @ResponseBody
    public String addFoo(@RequestParam String message) {

        System.out.println(message);
        return "server Reply- "+message;
    }

    @GetMapping("/convert")
    @ResponseBody
    public String convert(@RequestParam String amount) {
        int value = Integer.valueOf(amount);
        int rate = 20;

        double convertedValue = value * rate;

        System.out.println(convertedValue+"-convertedValue");
        return "server Reply- "+convertedValue;
    }
}
