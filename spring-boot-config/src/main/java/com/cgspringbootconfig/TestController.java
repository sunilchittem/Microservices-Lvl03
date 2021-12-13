package com.cgspringbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cgspringbootconfig.model.Details;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

	@Value("${my.name}")
	private String value;

	@Autowired
	private Details details;

	@GetMapping("/")
	public String getName() {
		return value;
	}

	@GetMapping("/info")
	public Details getDetails() {

		return details;
	}
}
