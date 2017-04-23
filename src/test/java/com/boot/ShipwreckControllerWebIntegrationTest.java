package com.boot;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class ShipwreckControllerWebIntegrationTest {

	@Test
	public void testListAll() throws IOException {
//		RestTemplate restTemplate = new TestRestTemplate();
//		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/shipwrecks", String.class);
//
//		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		JsonNode responseJson = objectMapper.readTree(response.getBody());
//		assertThat(responseJson.isMissingNode(), is(false));
//		assertThat(responseJson.toString(), equalTo("[{\"id\":1,\"name\":\"Big Bertha\",\"description\":\"Rusty Hulk\",\"condition\":\"okay\",\"depth\":1000,\"latitude\":25.76,\"longitude\":180.65,\"yearDiscovered\":1911}]"));

	}

}
