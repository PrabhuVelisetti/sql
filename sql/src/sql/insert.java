package sql;
import java.sql.*;

public class insert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://localhost:1433;databaseName=bank;encrypt=false;";
		String u="king";
		String p="5420";
		String q1="insert into student values(1,'prabhu',21)";
		
		Connection c=DriverManager.getConnection(url,u,p);
		Statement s=c.createStatement();
		s.addBatch(q1);
		s.executeBatch();
		System.out.println("inserted");
				
		
		
		

	}

}
