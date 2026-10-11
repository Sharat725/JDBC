package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Course {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseDb","root","root");
		Statement s = c.createStatement();
		
		// create database
//		s.execute("create database CourseDb");
//		System.out.println("Database created");
		
		// create table
//		s.execute("create table course_det(id int primary key,name varchar(50))");
//		System.out.println("table created");
		
		// insert values
//		s.execute("insert into course_det values(01,'English')");
//		s.execute("insert into course_det values(02,'Kannada')");
//		s.execute("insert into course_det values(03,'Hindi')");
//		s.execute("insert into course_det values(04,'Science')");
//		System.out.println("Values inserted");
		
		//Update
//		s.execute("update course_det set name='Social' where id=04");
//		System.out.println("Values updated");
		
		//Delete
		s.execute("delete from course_det where id=04");
		System.out.println("Values deleted");
				
		c.close();
		
		
	}

}
