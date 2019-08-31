package com.piyushmittal.tdd.iphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IphoneController {

    @Autowired
    private IphoneService iphoneService;

    @GetMapping("/iphone/{name}")
    private Iphone getIphone(@PathVariable String name) {
        return iphoneService.getIphoneDetails(name);
    }

}
