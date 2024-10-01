package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc1 {
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("connection");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manu","root","3750");
	System.out.println("successfully");
	PreparedStatement ps=con.prepareStatement("insert into student2 values(101,'Mansi')");
	int i=ps.executeUpdate();
	if(i>0) {
		System.out.println("inserted table"+i);
		
	}
}
}
