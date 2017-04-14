package package1;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class teams {

	String name;
	String country;
	String league;
	
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	void displayTeams() {
			String url = "jdbc:mysql://localhost/MovieRating";

			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch(java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}

			try {
				con = DriverManager.getConnection(url, "root", "12438630");
				stmt = con.createStatement();
	   		    
	   		    ResultSet rs=stmt.executeQuery("select * from teams");
	   		    while(rs.next())  
   		    	{
	   		    	System.out.println(rs.getString("name")+"  "+rs.getString("country")+"  "+rs.getString("league"));
   		    	}
	   		    	
			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}finally{
				try{
					stmt.close();
					con.close();
				}catch(SQLException e){}
			}
	}
	
	void addTeams(String tName,String tCountry,String tLeague){
		String url = "jdbc:mysql://localhost/team";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "root", "root");
			stmt = con.createStatement();
   		    stmt.executeUpdate("insert into teamDetails values("+tName+","+tCountry+","+tLeague);
   		    	
		    	
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
		
	}
	
	void deleteTeams(String tName){
		String url = "jdbc:mysql://localhost/team";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "root", "root");
			stmt = con.createStatement();
   		    stmt.executeUpdate("delete from teamDetails where"+name+"="+tName);
   		    	
		    	
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
		
	}
	
	
}
