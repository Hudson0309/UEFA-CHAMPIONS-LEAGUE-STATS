package package1;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Result {
	String tName1;
	String tName2;
	int goalsScoredByTeam1;
	int goalsScoredByTeam2;
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	public void insert(String tNm1,String tNm2,int goalsByTeam1,
	int goalsByTeam2){
		tName1=tNm1;
		tName2=tNm2;
		goalsScoredByTeam1=goalsByTeam1;
		goalsScoredByTeam2=goalsByTeam1;
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
   		    stmt.executeUpdate("insert into result values("+tNm1+","+tNm2+","+goalsScoredByTeam1+","+goalsScoredByTeam2);
   		    //change the name of the table to one in which the result is stored	
		    	
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
		
		
	}}


}
