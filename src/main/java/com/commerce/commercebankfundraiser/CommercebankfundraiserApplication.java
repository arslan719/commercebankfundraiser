package com.commerce.commercebankfundraiser;

import com.commerce.commercebankfundraiser.model.Doner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.Scanner;


@SpringBootApplication
@RestController
public class CommercebankfundraiserApplication {

	@GetMapping
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SpringApplication.run(CommercebankfundraiserApplication.class, args);

		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "Bilal786");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from users");
			while(resultSet.next()){
				System.out.println(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
