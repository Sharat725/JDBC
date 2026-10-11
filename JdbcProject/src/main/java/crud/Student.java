package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdb","root","root");
		Statement s=c.createStatement();
//		s.execute("create database Studentdb");
//		System.out.println("Database Created");
		
//		delete table
//		s.execute("drop table std_det");
//		System.out.println("Table deleted");
		
		
		// create table
//		s.execute("create table std_det(id int primary key,name varchar(50))");
//		System.out.println("Table created");
		
//		Insertion
//		s.execute("insert into std_det values(101,'chinnu')");
//		s.execute("insert into std_det values(102,'charu')");
//		s.execute("insert into std_det values(103,'chidu')");
//		s.execute("insert into std_det values(104,'chi')");
//		System.out.println("Values inserted");
		
		
		//Update
//		s.execute("update std_det set name='Raju' where id=104");
//		System.out.println("Values updated");

		//Delete
		s.execute("delete from std_det where id=104");
		System.out.println("Values deleted");
		
		s.close();
		
		
	}

}
