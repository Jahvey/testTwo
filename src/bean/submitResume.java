package bean;

public class submitResume {
private int ID;
private int Pnumber;
private String Qnumber;
private String result;
public submitResume(){
	ID=0;
	Pnumber=0;
	Qnumber="";
	result="false";
}
public void setResult(String res){
	this.result=res;
}
public void setID(int Id){
	this.ID=Id;
}
public void setPnumber(int Pn){
	this.Pnumber=Pn;
}
public void setQnumber(String Qn){
	this.Qnumber=Qn;
}
public String getResult(){
	return this.result;
}
public int getId(){
	return this.ID;
}
public int getPnumber(){
	return this.Pnumber;
}
public String getQnumber(){
	return this.Qnumber;
}
}
