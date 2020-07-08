package com.mainul.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionTest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		try {

			PrintWriter writer = response.getWriter();
			writer.println("Connected to " + driver);

			Class.forName(driver);

			Connection connection = DriverManager.getConnection(username, password, url);

			writer.println("Connection sucessfull.");

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
