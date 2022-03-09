package com.example.intern.services;

import com.example.intern.Models.ExchangeRates;
import com.example.intern.Models.Gold;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class NBPServices {
    ObjectMapper mapper=new ObjectMapper();
    public Gold[] getGoldPrice() throws IOException{
        URL url=new URL("https://api.nbp.pl/api/cenyzlota/last/15/?format=json");
        HttpURLConnection connection=(HttpURLConnection) url.openConnection();
        InputStream inputStream=connection.getInputStream();
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        return mapper.readValue(line, Gold[].class);
    }

    public ExchangeRates getExchangeRates(String code) throws IOException{
        URL url=new URL("https://api.nbp.pl/api/exchangerates/rates/a/"+code +"/last/5/?format=json");
        HttpURLConnection connection=(HttpURLConnection) url.openConnection();
        InputStream inputStream=connection.getInputStream();
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        return mapper.readValue(line,ExchangeRates.class);
    }

}
