package com.example.intern.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class ExchangeRates {

    @Getter
    @Setter
    @JsonProperty("table")
    private String table;
    @Getter
    @Setter
    @JsonProperty("currency")
    private String currency;
    @Getter
    @Setter
    @JsonProperty("code")
    private String code;
    @Getter
    @Setter
    @JsonProperty("rates")
    private Rates[] rates;

}

class Rates{

    @Getter
    @Setter
    @JsonProperty("no")
    private String no;

    @Getter
    @Setter
    @JsonProperty("effectiveDate")
    private Date effectiveDate;

    @Getter
    @Setter
    @JsonProperty("mid")
    private double mid;
}