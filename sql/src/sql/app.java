package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //String Url = "jdbc:sqlserver://localhost:1433;encrypt=false";
          

				String query="select * from customer";
				try {
					Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bank;encrypt=false;user=king;password=5420;");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
					String str="";
					while(rs.next()) {
						str=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8);
						System.out.println(str);
					}
				}
				catch(Exception e) {
					System.out.println(e);
				}


	}

}
