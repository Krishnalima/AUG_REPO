package com.bjs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3309/fsb";
		String user="root";
		String pass="Krishna@123";
		
		
		try {
			Connection conn=DriverManager.getConnection(url, user, pass);
			System.out.println("Connection is Susessfull");
			
			String sql="insert into `student`(`id`,`name`,`email`,`marks`)" +"values(10,'Sachin','sachin@gmail.com',85)" ;
			Statement stmnt=conn.createStatement();
			int i=stmnt.executeUpdate(sql);
			if (i==1) {
				System.out.println("record has been inserted");
			}else {
				System.out.println("record has not been inserted");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("issues while creating a connection object");
		}
	}

}
