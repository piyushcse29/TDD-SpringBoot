package com.piyushmittal.tdd.iphone;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(IphoneService.class)
public class IphoneServiceTest {

    @Mock
    IphoneService iphoneService;

    @Test
    public void getIphone() throws Exception{

        when(iphoneService.getIphoneDetails("X")).thenReturn(new Iphone("X", "Silver"));
        Iphone iphone = iphoneService.getIphoneDetails("X");
        assertThat(iphone.getName()).isEqualTo("X");
        assertThat(iphone.getColor()).isEqualTo("Silver");

    }

}
