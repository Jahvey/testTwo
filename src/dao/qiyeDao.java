package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.*;
public class qiyeDao {
	public qiyeDao(){
		
	}
	public void pushAqiye(qiye date){
		
	}
	public List<qiye> queryAllqiye(){List<qiye> list=new ArrayList<qiye>();
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from qiye";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
			qiye date=new qiye();
			/*date.set
			 * 
			 */
			
		}
		rs.close();
		stmt.close();
		conn.close();

		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list;
	
}
public qiye queryByIdqiye(String id){
	qiye date=new qiye();
	try{
	String url="jdbc:mysql://localhost:3306/date";
	Class.forName("com.mysql.jdbc.Driver");	
	Connection conn = DriverManager.getConnection(url,"root","123");
	Statement stmt=conn.createStatement();
	String sql="select * from qiye where Fnumber="+String.valueOf(id);
	ResultSet rs=stmt.executeQuery(sql);
	System.out.println("test4-2-1");
	while(rs.next()){
		System.out.println("test4-2+1");
		date.setFnumber(rs.getString(1));
		date.setFname(rs.getString(2));
		date.setFphone(rs.getString(3));
		date.setAddress(rs.getString(4));
		date.setDescription(rs.getString(5));
		date.setSkill(rs.getString(6));
		date.setPassword(rs.getString(7));
		System.out.println("test4-2"+date.getPass());
	}
	rs.close();
	stmt.close();
	conn.close();

	}
catch(ClassNotFoundException e){
	
  } catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  }
	return date;
}

}
