package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.*;

public class zhaopinDao {

public zhaopinDao(){}
public void addAjob(zhaopin date){
	try{
		String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="insert into zhaopin(Pnumber,Pname,Num,slavery,limi,time,ownerNumber"+
				")values("+date.getPnumber()+",'"+date.getPname()+"',"+date.getNum()+
				",'"+date.getSlavery()+"','"+date.getLimit()+"','"+date.getTime()+"','"+date.getOwnerNum()+"')";
		System.out.println("sql: #"+sql+"#");
		stmt.executeUpdate(sql);
		System.out.println("test11-1");
		
		
		
		stmt.close();
		conn.close();

		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public void deletezhaopinById(String Id){
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="delete from zhaopin where Pnumber="+Id;
		stmt.executeUpdate(sql);
		System.out.println("test9-1");
		
		System.out.println("test9-3");
		
		stmt.close();
		conn.close();

		}
		catch(ClassNotFoundException e){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public List<zhaopin> queryByOwnerId(String Id){
	List<zhaopin> list=new ArrayList<zhaopin>();
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from zhaopin where OwnerNumber="+Id;
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("test9-1");
		while(rs.next()){
			System.out.println("test9-2");
			zhaopin date=new zhaopin();
			date.setPnumber(rs.getInt(1));
			date.setPname(rs.getString(2));
			date.setNum(rs.getInt(3));
			date.setSlavery(rs.getString(4));
			date.setLimit(rs.getString(5));
			date.setTime(rs.getString(6));
			date.setOwnerNum(rs.getString(7));
			list.add(date);
		}
		System.out.println("test9-3");
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
public qiye queryOwnerById(String num){
	qiye date=new qiye();
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from qiye where Fnumber="+num;
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("test8-1");
		while(rs.next()){
			System.out.println("test8-2");
			date.setFnumber(rs.getString(1));
			date.setFname(rs.getString(1));
			date.setFphone(rs.getString(3));
			date.setAddress(rs.getString(4));
			date.setDescription(rs.getString(5));
			date.setSkill(rs.getString(6));
			date.setPassword(rs.getString(7));
			
			
		}
		System.out.println("test8-3");
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
public zhaopin queryzhaopinById(int Pnum){
	zhaopin date=new zhaopin();
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from zhaopin where Pnumber="+Pnum;
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("test8-1");
		while(rs.next()){
			System.out.println("test8-2");
			date.setPnumber((rs.getInt(1)));
			date.setPname(rs.getString(2));
			date.setNum(rs.getInt(3));
			date.setSlavery((rs.getString(4)));
			date.setLimit((rs.getString(5)));
			date.setTime(rs.getString(6));
			date.setOwnerNum((rs.getString(7)));
			
			
		}
		System.out.println("test8-3");
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
public List<zhaopin> queryAllzhaopinList(){
	List<zhaopin> list=new ArrayList<zhaopin>();
	try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from zhaopin";
		ResultSet rs=stmt.executeQuery(sql);
		
		System.out.println("test6");
		while(rs.next()){
			zhaopin date=new zhaopin();
			System.out.println("test7-1"+rs.getString(2));
			date.setPnumber(rs.getInt(1));
			date.setPname(rs.getString(2));
			date.setNum(rs.getInt(3));
			
			date.setSlavery(rs.getString(4));
			
			date.setLimit(rs.getString(5));
			date.setTime(rs.getString(6));
			
			date.setOwnerNum(rs.getString(7));
			System.out.println("test7"+date.getPname());
			
			list.add(date);
			
		}
		System.out.println("test7-2");
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
public List<zhaopin> queryByqiyeNum(int num){
	List<zhaopin> list=new ArrayList<zhaopin>();
	return list;
}
public List<zhaopin> queryByDir(String str){
	List<zhaopin> list=new ArrayList<zhaopin>();
	return list;
}
/*
 * �������Ե�get����
 */
}
