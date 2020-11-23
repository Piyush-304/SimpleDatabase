package com.anish;
import java.util.*;
import java.sql.*;

public class Database {
             
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/momentum1","root","Boeing747");
			
			//PreparedStatement ps=con.prepareStatement("insert into mamta2 values(?,?)");	
			//ps.setString(1,"Anand");
			//ps.setString(2, "Anand@SINGH");
			//int x=ps.executeUpdate();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from ordering where email='Pushpasingh@gmail.com'");
			
			while(rs.next())
			
			         System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3)+ " " +rs.getString(4));
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
