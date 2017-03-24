package dao;
import bean.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class dao {
public void daoQuery(){
	String url="jdbc:mysql://localhost:3306/web";
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
	Connection conn;
	try {
		conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
  }
public List<qiuzhi> queryAllqiuzhi(){
	List<qiuzhi> list=new ArrayList<qiuzhi>();
	try{
		String url="jdbc:mysql://localhost:3306/web";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * form qiuzhi";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
			qiuzhi date=new qiuzhi();
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
public qiuzhi queryByIdqiuzhi(int id){
	qiuzhi date=new qiuzhi();
	try{
	String url="jdbc:mysql://localhost:3306/web";
	Class.forName("com.mysql.jdbc.Driver");	
	Connection conn = DriverManager.getConnection(url,"root","123");
	Statement stmt=conn.createStatement();
	String sql="select * form qiuzhi where Qnumber="+String.valueOf(id);
	ResultSet rs=stmt.executeQuery(sql);
	if(rs.next()){
		/*
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
	return date;
}
public List<qiye> queryAllqiye(){List<qiye> list=new ArrayList<qiye>();
	try{
		String url="jdbc:mysql://localhost:3306/web";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * form qiye";
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
public qiye queryByIdqiye(int id){
	qiye date=new qiye();
	try{
	String url="jdbc:mysql://localhost:3306/web";
	Class.forName("com.mysql.jdbc.Driver");	
	Connection conn = DriverManager.getConnection(url,"root","123");
	Statement stmt=conn.createStatement();
	String sql="select * form qiye where Qnumber="+String.valueOf(id);
	ResultSet rs=stmt.executeQuery(sql);
	if(rs.next()){
		/*
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
	return date;
}


}
