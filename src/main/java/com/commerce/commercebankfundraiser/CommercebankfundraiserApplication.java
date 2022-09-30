package com.commerce.commercebankfundraiser;

import com.commerce.commercebankfundraiser.model.Doner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@SpringBootApplication
@RestController
public class CommercebankfundraiserApplication {

	@GetMapping
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SpringApplication.run(CommercebankfundraiserApplication.class, args);
		Doner d = new Doner();


	}

}
