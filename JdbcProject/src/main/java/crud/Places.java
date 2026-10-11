package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Places {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Placesdb","root","root");
		Statement s = c.createStatement();
//		s.execute("create database Placesdb");
//		System.out.println("Database created");
		
//		s.execute("use Placesdb");
//		System.out.println("database using");
		
		//create table
//		s.execute("create table plac_det(id int primary key,name varchar(50))");
//		System.out.println("table create");
		
		//insert values
//		s.execute("insert into plac_det values(1,'Vijayapura')");
//		s.execute("insert into plac_det values(2,'Bengaluru')");
//		s.execute("insert into plac_det values(3,'Sindagi')");
//		s.execute("insert into plac_det values(4,'Bijapur')");
//		System.out.println("data inserted");
		
		//update
//		s.execute("update plac_det set name='bagalakote' where id=4");
//		System.out.println("Updated");
		
		//delete
		s.execute("delete from plac_det where id=4");
		System.out.println("deleted");
		
		s.close();
	}
	

}
