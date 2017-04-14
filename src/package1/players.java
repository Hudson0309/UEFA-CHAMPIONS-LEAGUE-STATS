package package1;

import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class players {

	static int totalPlayer = 0; 
	static int playerId;
	int age;
	int goals;
	int yellowCards;
	int redCards;
	String name;
	String nationality;
	String team;
	
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	
	players(){
		
	}
	
	players(players p){
		
		totalPlayer++;
		playerId=totalPlayer;
	}
	
	void displayPlayers() {
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
	   		    
	   		    ResultSet rs=stmt.executeQuery("select * from players");
	   		    while(rs.next())  
   		    	{
	   		    	System.out.println(rs.getString("name")+"  "+rs.getString("nationality")+"  "+rs.getString("team"));
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

	void getBasicInfo ()
	{
		Scanner reader = new Scanner (System.in);

		System.out.println ("write player name");
		name = reader.nextLine ();

		System.out.println ("write team name");
		name = reader.nextLine ();

		System.out.println ("write nationality");
		nationality = reader.nextLine ();

		System.out.println ("write age");
		age = reader.nextInt ();

		System.out.println ("write goals");
		goals = reader.nextInt ();

		System.out.println ("write yellow cards");
		yellowCards = reader.nextInt ();

		System.out.println ("write red cards");
		redCards = reader.nextInt ();
		
		reader.close();
	}
}
