package com.bjs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3309/fsb";
		String user="root";
		String pass="Krishna@123";
		try {
			Connection conn=DriverManager.getConnection(url,user, pass);
			System.out.println("Connection is sucessfull");
			String sql="delete from `student` where `id`=10";
	       Statement stmnt=conn.createStatement();
	       int i=stmnt.executeUpdate(sql);
	       if (i==0) {
			System.out.println("record has been deleted");
		}else {
			System.out.println("record has not been deleted");
		}
	                       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("issue while creating connection object");
		}
	}

}
