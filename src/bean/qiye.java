package bean;

import java.util.ArrayList;
import java.util.List;

public class qiye {
private String Fnumber;
private String Fname;
private String Fphone;
private String Address;
private String Description;
private String Skill;
private String Fpassword;
private List <zhaopin> list;
public qiye(){
	list=new ArrayList<zhaopin>();
}
public void setList(zhaopin date){
	list.add(date);
}
public void setFnumber(String num){
	this.Fnumber=num;
}
public void setFname(String name){
	this.Fname=name;
}
public void setFphone(String pho){
	this.Fphone=pho;
}
public void setAddress(String address){
	this.Address=address;
}
public void setDescription(String disra){
	this.Description=disra;
}
public void setSkill(String skill){
	this.Skill=skill;
}
public void setPassword(String pass){
	this.Fpassword=pass;
}
public List<zhaopin> getzhaopinList(){
	return this.list;
}

public String getPass(){
	return this.Fpassword;
	
}
public String getName(){
  return Fname;
}
public String getAddress(){
	return Address;
}
public String getNum(){
	return Fnumber;
}
public String getDescription(){
	return this.Description;
}
public String getPhone(){
	return this.Fphone;
}
public String getSkill(){
	return this.Skill;
}
/*
 *�������Ե�set��get���� 
 */
}
