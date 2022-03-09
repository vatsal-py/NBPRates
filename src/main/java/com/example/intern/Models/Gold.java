package com.example.intern.Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Gold {
    @Getter
    @Setter
    @JsonProperty("cena")
    private double price;
    @Getter
    @Setter
    @JsonProperty("data")
    private Date date;

}
