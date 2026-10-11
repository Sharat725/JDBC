package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductDB","root","root");
		Statement s = c.createStatement();
//		s.execute("create database ProductDB");
//		System.out.println("Database created");
		
		//create table
//		s.execute("create table prod_det(id int primary key,p_name varchar(50),price int not null,quantity int not null)");
//		System.out.println("table created");
		
		//insert values
//		s.execute("insert into prod_det values(1,'H_oil',35,2)");
//		s.execute("insert into prod_det values(2,'paste',30,1)");
//		s.execute("insert into prod_det values(3,'brush',15,3)");
//		s.execute("insert into prod_det values(4,'soap',25,3)");
//		System.out.println("value inserted");
		
		//update
//		s.execute("update prod_det set p_name='powder' where id=4");
//		System.out.println("updated");
		
		
		// retrieve
		ResultSet r = s.executeQuery("select * from prod_det");
		while (r.next()) {
			System.out.println(r.getInt(1) + " - " + r.getString(2) + " - " + r.getInt(3) + " - "+ r.getInt(4) );
		}
		
		//delete
//		s.execute("delete from prod_det where id=4");
//		System.out.println("deleted");
			
		c.close();
	}

}
