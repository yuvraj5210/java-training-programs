package com.doctor.util;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DbConnection {

	static  Connection connection;


	public static Connection openConnection()
	{
		String url="jdbc:oracle:thin:@192.168.18.40:1521:ASCEND";
		String username="ychouksey";
		String password="Simeio@2023";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection =DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

	public static void closeConnection()
	{
		try {
			if(connection!=null)
			{
				connection.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}



}
