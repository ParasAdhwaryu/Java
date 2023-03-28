package com.practicing.JavaJdbc.Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Java_Jdbc 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.jdbc.Driver");  
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBNAME","root","pswd"); 
    	Statement st=con.createStatement();
    	String sql="select * from Myemp";
    	ResultSet res=st.executeQuery(sql);
    	while(res.next()) {
    		System.out.println(res.getInt(1)+","+res.getString(2)+","+res.getInt(3));
    	}
    	sql="Insert into Myemp values(?,?,?)";
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.setInt(1, 1);
    	ps.setString(2, "Pransh");
    	ps.setInt(3, 21);
    	int l=ps.executeUpdate();
    	//con.close();
    	
    	ps=con.prepareStatement("Delete * from Myemp where id=?");
    	ps.setInt(1,2);
    	int k=ps.executeUpdate();
    	
    	ps=con.prepareStatement("Update Myemp set age=? where id=?");
    	ps.setInt(l, 23);
    	ps.setInt(2, 1);
    }
}
