package com.example.intern.controller;

import com.example.intern.Models.ExchangeRates;
import com.example.intern.services.NBPServices;
import com.example.intern.Models.Gold;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class NBPController {
    NBPServices services=new NBPServices();
    @GetMapping("")
    public double goldPrice () throws IOException {
        double sum = 0;
        Gold[] gold = services.getGoldPrice();
        for (Gold g:gold) { sum += g.getPrice(); }
        return (sum/gold.length);
    }

    @GetMapping("/api/exchange-rates/{currencyCode}")
    public ExchangeRates getExchangeRates( @PathVariable String currencyCode) throws IOException {
        return services.getExchangeRates(currencyCode);
    }
}
