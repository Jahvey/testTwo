package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.*;
public class submitResumeDao {
	
	public submitResumeDao(){}
	public submitResume queryResumeByPAndQId(String PId,String QId){
		submitResume date=new submitResume();
		try{
			String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
			Class.forName("com.mysql.jdbc.Driver");	
			Connection conn = DriverManager.getConnection(url,"root","123");
			Statement stmt=conn.createStatement();
			
			
			String sql="select * from submitResume where Qnumber='"+QId+"' and Pnumber="+PId;
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				date.setID(rs.getInt(1));
				date.setPnumber(rs.getInt(2));
				date.setQnumber(rs.getString(3));
				date.setResult(rs.getString(4));
			}
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
	public int getsubmitResumeNum(){
		int num=0;
		try{
			String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
			Class.forName("com.mysql.jdbc.Driver");	
			Connection conn = DriverManager.getConnection(url,"root","123");
			Statement stmt=conn.createStatement();
			
			
			String sql="select * from submitResume;";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				num++;
			}
			stmt.close();
			conn.close();

			}
			catch(ClassNotFoundException e){
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return num;
	}
public List<submitResume> queryResumeByQnum(String Qnum){
	List<submitResume> list=new ArrayList<submitResume>();
	try{
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from submitResume where Qnumber="+Qnum;
		System.out.println("sql: #"+sql+"#");
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			submitResume date=new submitResume();
			date.setID(rs.getInt(1));
			date.setPnumber(rs.getInt(2));
			date.setQnumber(rs.getString(3));
			date.setResult(rs.getString(4));
			list.add(date);
		}
		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list;
}
public List<submitResume> queryAllSubmitResume(){
	List<submitResume> list=new ArrayList<submitResume>();
	try{
	String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
	Class.forName("com.mysql.jdbc.Driver");	
	Connection conn = DriverManager.getConnection(url,"root","123");
	Statement stmt=conn.createStatement();
	String sql="select * from submitResume;";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next()){
		submitResume date=new submitResume();
		date.setID(rs.getInt(1));
		date.setPnumber(rs.getInt(2));
		date.setQnumber(rs.getString(3));
		date.setResult(rs.getString(4));
		list.add(date);
	}
	}
	catch(ClassNotFoundException e){
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
public List<submitResume> queryResumeByPnum(int pnum){
	List<submitResume> list=new ArrayList<submitResume>();
	try{
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from submitResume where Pnumber="+String.valueOf(pnum);
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			submitResume date=new submitResume();
			date.setID(rs.getInt(1));
			date.setPnumber(rs.getInt(2));
			date.setQnumber(rs.getString(3));
			date.setResult(rs.getString(4));
			list.add(date);
		}
		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list;
}
public int[] getsubmitResumeNumByPnum(String FId){
	System.out.println("---"+FId+"------");
	int[] num=new int[50];
	
	try{
		System.out.println("---"+FId+"");
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		List<submitResume> list=new ArrayList<submitResume>();
		System.out.println("---"+FId);
	
		
		
		String sql3="select * from zhaopin where ownerNumber="+FId;
		System.out.println("sql: #"+sql3+"#");
		ResultSet rs3=stmt.executeQuery(sql3);
	    list=this.queryAllSubmitResume();
        int i=1;
		while(rs3.next()){
			
			for(int j=0;j<list.size();j++){
				 System.out.println(i+"----"+rs3.getInt(1)+"----"+j+"---"+list.get(j).getPnumber());
				if(rs3.getInt(1)==list.get(j).getPnumber()){
					num[i-1]++;
				}
			}
		i++;
		  
		   
		}
		
		stmt.close();
		conn.close();

		}
	   
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return num;
}
public void pushAResume(submitResume date) {
	try{
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sqlT="select * from submitResume;";
		
		String sql="insert into submitResume(ID,Pnumber,Qnumber,result)values("+date.getId()+","+date.getPnumber()+",'"+date.getQnumber()+"','"+date.getResult()+"')";
		System.out.println("sql: #"+sql+"#");
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();

		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public void updateResume(String sql){
	try{
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		//String sqlT="select * from submitResume;";
		
		
		System.out.println("sql: #"+sql+"#");
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();

		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
