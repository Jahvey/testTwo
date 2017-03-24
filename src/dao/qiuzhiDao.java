package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.*;
public class qiuzhiDao {
	public qiuzhiDao(){
		
	}
	public void pushAqiuzhi(qiuzhi date){
		try{
			String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
			Class.forName("com.mysql.jdbc.Driver");	
			Connection conn = DriverManager.getConnection(url,"root","123");
			Statement stmt=conn.createStatement();
			//System.out.println("dao:"+date.getHomeland());
			String sql="insert into qiuzhi(Qnumber,Qname,Age,Sex,Birthday,Qphone,Homeland"+
			",Graduate,LastEducation,Skill,Qpassword)values('"+date.getNum()+"','"+date.getName()+"',"+date.getAge()+
			",'"+date.getSex()+"','"+date.getBirthday()+"','"+date.getPhone()+"','"+date.getHomeland()+"','"+date.getGraduate()+
			"','"+date.getLastEducation()+"','"+date.getSkill()+"','"+date.getPass()+"')";
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
	public List<qiuzhi> queryAllqiuzhi(){
		List<qiuzhi> list=new ArrayList<qiuzhi>();
		try{
			String url="jdbc:mysql://localhost:3306/date?useUnicode=true&characterEncoding=UTF8";
			Class.forName("com.mysql.jdbc.Driver");	
			Connection conn = DriverManager.getConnection(url,"root","123");
			Statement stmt=conn.createStatement();
			String sql="select * from qiuzhi";
			ResultSet rs=stmt.executeQuery(sql);
			qiuzhi date=new qiuzhi();
			while(rs.next()){
				date.setQnumber(rs.getString(1));
				date.setName(rs.getString(2));
				date.setAge(rs.getInt(3));
				date.setSex(rs.getString(4));
				date.setBirthday(rs.getString(5));
				date.setPhone(rs.getString(6));
				date.setHomeland(rs.getString(7));
				date.setGraduate(rs.getString(8));
				date.setLastEducation(rs.getString(9));
				date.setSkill(rs.getString(10));
				date.setQpassword(rs.getString(11));
				/*date.set
				 * 
				 */
				list.add(date);
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
	public qiuzhi queryByIdqiuzhi(String id){
		qiuzhi date=new qiuzhi();
		try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from qiuzhi where Qnumber="+String.valueOf(id);
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("test2");
		while(rs.next()){
			/*
			 * 
			 */
			System.out.println(rs.getString(1));
			date.setQnumber(rs.getString(1));
			date.setName(rs.getString(2));
			date.setAge(rs.getInt(3));
			date.setSex(rs.getString(4));
			date.setBirthday(rs.getString(5));
			date.setPhone(rs.getString(6));
			date.setHomeland(rs.getString(7));
			date.setGraduate(rs.getString(8));
			date.setLastEducation(rs.getString(9));
			date.setSkill(rs.getString(10));
			date.setQpassword(rs.getString(11));
			
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
	public List<qiuzhi> queryqiuzhiByPage(int page){
		List<qiuzhi> list=new ArrayList<qiuzhi>();
		qiuzhi date=new qiuzhi();
		try{
		String url="jdbc:mysql://localhost:3306/date";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn = DriverManager.getConnection(url,"root","123");
		Statement stmt=conn.createStatement();
		String sql="select * from qiuzhi where Qnumber="+String.valueOf(page);
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("test2");
		while(rs.next()){
			/*
			 * 
			 */
			System.out.println(rs.getString(1));
			date.setQnumber(rs.getString(1));
			date.setName(rs.getString(2));
			date.setAge(rs.getInt(3));
			date.setSex(rs.getString(4));
			date.setBirthday(rs.getString(5));
			date.setPhone(rs.getString(6));
			date.setHomeland(rs.getString(7));
			date.setGraduate(rs.getString(8));
			date.setLastEducation(rs.getString(9));
			date.setSkill(rs.getString(10));
			date.setQpassword(rs.getString(11));
			
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
}
