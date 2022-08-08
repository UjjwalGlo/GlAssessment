package com.college.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.college.model.Student;//import Student Class
import com.college.model.StudentService;//import service class

public class StudentDao {

	public Connection getConnection() throws Exception

	{
		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

		return conn;

	}

	public void Insert(Student  s)

 {

 int i=0;

  PreparedStatement pstmt=getConnection().prepareStatement("insert into employ values(?,?,?,?,?)");
 
	pstmt.setInt(1, s.getRollno());
	pstmt.setString(2,s.getStudentName());
	pstmt.setString(3,s.getStandard());
	pstmt.setString(4,s.getDob());
	pstmt.setDouble(5,s.getFees());
	pstmt.executeUpdate();

      //Display() is used for display all the records of student table
      public void display() {
    	  
    	//Create a query
		String sql = "SELECT * FROM student";
		
			PreparedStatement pstmt = getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData res = rs.getMetaData();
			
			while (rs.next()) {
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= res.getColumnCount(); i++) {
					String colName = res.getColumnName(i);
					
					sb.append(rs.getObject(colName));
					if (i != res.getColumnCount()) sb.append(", ");
				}
				
				System.out.println(sb);
			}
     	}

    }

}
