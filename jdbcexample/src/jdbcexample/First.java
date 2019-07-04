package jdbcexample;
import java.sql.*; 
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/abar","root","root");  
			
			System.out.println("hi");
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into emp values(2,'abarna',21)");
			//stmt.executeUpdate("update emp set name='Vimal',age=20 where id=1");  
			//stmt.executeUpdate("update emp set name='abar',age=20 where id=1");
			int result=stmt.executeUpdate("delete from emp where id=1");
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
