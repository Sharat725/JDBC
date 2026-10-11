package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// load and register
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedb", "root", "root"); // establish the connection with database and create connection by storing it in Connection interface
		Statement s=c.createStatement();
//		s.execute("create database Employeedb");
//		System.out.println("DataBase created");
//		s.execute("create table emp_det(id int primary key,name varchar(50))");
//		System.out.println("Table created");
		
//		Insertion
//		s.execute("insert into emp_det values(101,'chinnu')");
//		s.execute("insert into emp_det values(102,'charu')");
//		s.execute("insert into emp_det values(103,'chidu')");
//		s.execute("insert into emp_det values(104,'chi')");
//		System.out.println("Values inserted");
//		
		
		//Update
//		s.execute("update emp_det set name='Raju' where id=104");
//		System.out.println("Values updated");
		
		//Delete
		s.execute("delete from emp_det where id=104");
		System.out.println("Values deleted");
		
		c.close();
	}

}
