package com.piyushmittal.tdd.iphone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IphoneIntegrationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void getIphoneDetails() {

		ResponseEntity<Iphone> response = restTemplate.getForEntity("/iphone/X", Iphone.class);

		assert(response.getStatusCode()).equals(HttpStatus.OK);
		assert (response.getBody().getName()).equals("X");
		assert (response.getBody().getColor()).equals("Silver");

	}

}
