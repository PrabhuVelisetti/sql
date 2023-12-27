package sql;
import java.sql.*;

public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://localhost:1433;databaseName=bank;encrypt=false;";
		String u="king";
		String p="5420";
		String q="create table student(id int,name varchar(20),age int)";
		try {
			Connection c=DriverManager.getConnection(url,u,p);
			Statement s=c.createStatement();
			s.execute(q);
		
			System.out.println("table created");
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
	
	}

}
