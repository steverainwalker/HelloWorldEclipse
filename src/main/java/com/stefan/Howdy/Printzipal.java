package com.stefan.Howdy;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration

public class Printzipal {

	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) throws Exception {
	        SpringApplication.run(Printzipal.class, args);
	}
	
}
