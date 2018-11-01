package com.bsm.toyproject;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

/**
 * MySQL Connection Test Code
 */
public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // MySQL Driver 6 이상
	// com.mysql.jdbc.Driver : MySQL Driver 5 이하
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PW = "system1234";
	
	@Test
	public void testConnection() throws Exception {
		// DBMS에 맞게 Driver를 로
		Class.forName(DRIVER);
		
		// java SQL 패키지의 DriverManager를 통해서 DBMS 연결 
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			
			System.out.println("JDBC 연결 성공");
			System.out.println(con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
