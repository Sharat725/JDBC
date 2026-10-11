package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee1","root","root");
		Statement s = c.createStatement();
//		s.execute("create database Employee1");
//		System.out.println("database created");
		
//		s.execute("create table emp_det(id int primary key,name varchar(50),ph_no bigint)");
//		System.out.println("table created");
		
		Scanner sc= new Scanner(System.in);
		
		//Insert
//		PreparedStatement ps=c.prepareStatement("insert into emp_det values(?,?,?)");
//		System.out.println("Enter the ID");
//		int id1=sc.nextInt();
//		ps.setInt(1, id1);
//		
//		System.out.println("Enter Name");
//		String name1=sc.next();
//		ps.setString(2, name1);
//		
//		System.out.println("Enter ph_no");
//		long ph1=sc.nextLong();
//		ps.setLong(3, ph1);
//		
//		ps.execute();
//		System.out.println("values inserted");
		
		
		//Update
//		PreparedStatement ps2=c.prepareStatement("update emp_det set name=?,ph_no=? where id=?");
//		System.out.println("Enter the name");
//		String name2=sc.next();
//		ps2.setString(1, name2);
//		
//		System.out.println("Enter ph_no");
//		long ph2=sc.nextLong();
//		ps2.setLong(2, ph2);
//		
//		System.out.println("Enter id to update");
//		int id2=sc.nextInt();
//		ps2.setInt(3, id2);
//		
//		ps2.executeUpdate();
//		System.out.println("values updated");
		
		
		//Fetch
//		PreparedStatement ps3=c.prepareStatement("select * from emp_det where id=?");
//		System.out.println("Enter id");
//		int id3=sc.nextInt();
//		ps3.setInt(1, id3);
//		
//		ResultSet r=ps3.executeQuery();
//		r.next();
//		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getLong(3));
		
		//Delete
		PreparedStatement ps4=c.prepareStatement("delete from emp_det where id=?");
		System.out.println("Enter id to delete");
		int id4=sc.nextInt();
		ps4.setInt(1, id4);
		ps4.execute();
		System.out.println("Value deleted");
		
	}

}
