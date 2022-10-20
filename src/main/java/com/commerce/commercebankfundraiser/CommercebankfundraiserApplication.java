package com.commerce.commercebankfundraiser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.*;



@SpringBootApplication
public class CommercebankfundraiserApplication {

	public static void main(String[] args) {

		SpringApplication.run(CommercebankfundraiserApplication.class, args);

		Connection connection = null;

try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fundraiser", "root", "Bilal786");
//			//Statement statement = connection.createStatement();
			//ResultSet resultSet = statement.executeQuery("USE registration");
			//PreparedStatement pst = connection.prepareStatement("insert into users(id, name, email, title) values(?,?,?,?)" );
////			pst.setString(1, id);
////			pst.setString(2, name);
////			pst.setString(3, email);
////			pst.setString(4, title);
////			int rowCount = pst.executeUpdate();
//			while(resultSet.next()){
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getString("email"));
//				System.out.println(resultSet.getString("title"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//
//

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
