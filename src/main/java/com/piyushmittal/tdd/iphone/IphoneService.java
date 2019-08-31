package com.piyushmittal.tdd.iphone;

import org.springframework.stereotype.Component;

@Component
public class IphoneService {
    public Iphone getIphoneDetails(String name) {
        return new Iphone(name,"Silver");
    }
}
