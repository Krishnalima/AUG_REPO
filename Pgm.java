package com.bjs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Pgm {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3309/fsb";
		String user="root";
		String pass="Krishna@123";
		
		
		try {
			Connection conn=DriverManager.getConnection(url, user, pass);
			System.out.println("Connection is Susessfull");
			
			String sql="select * from `student`";
			Statement stmnt=conn.createStatement();
			ResultSet res=stmnt.executeQuery(sql);
			
			
			while (res.next()==true) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("issues while creating a connection object");
		}

	}

}
