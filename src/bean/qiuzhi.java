package bean;

public class qiuzhi {
  private String Qnumber;
  private String Qname;
  private String Qpassword;
  private int Age;
  private String Sex;
  private String Birthday;
  private String Qphone;
  private String homeland;
  private String LastEducation;
  private String Graduate;
  private String Skill;
  
  public qiuzhi(){
	  Qnumber="";
	  Qname="";
	  Qpassword="";
	  Age=0;
	  Sex="";
	  Birthday="";
	  Qphone="";
	  homeland="";
	  LastEducation="";
	  Graduate="";
	  Skill="";
	  
  }
  public qiuzhi(String num,String Homeland, String name,String LastEducation,String Birthday,String Qphone,int Age,String Graduate,String Skill,String Sex,String Qpassword){
	  this.Qnumber=num;
	  this.Qpassword=Qpassword;
	  this.Skill=Skill;
	  this.LastEducation=LastEducation;
	  this.Qname=name;
	  this.Birthday=Birthday;
	  this.Graduate=Graduate;
	  this.Sex=Sex;
	  this.Qphone=Qphone;
	  this.Age=Age;
	  this.homeland=Homeland;
  }
  public void setHomeland(String home){
	  this.homeland=home;
  }
  public void setPhone(String pho){
	  this.Qphone=pho;
  }
  public void setSex(String sex){
	  this.Sex=sex;
  }
   public void setBirthday(String bir){
	  this.Birthday=bir;
  }
  public void setGraduate(String gra){
	  this.Graduate=gra;
  }
  public void seHomeland(String home){
	  this.homeland=home;
  }
  public void setName(String name){
	  this.Qname=name;
  }
  public void setQnumber(String num){
	  this.Qnumber=num;
	  
  }
  public void setQpassword(String Pass){
	  this.Qpassword=Pass;
	  
  }
  public void setSkill(String Skill){
	  this.Skill=Skill;
	   
  }
  public void setLastEducation(String Edu){
	  this.LastEducation=Edu;
  }
  public void setAge(int Age){
	  this.Age=Age;
  }
  public String getBirthday(){
	  return this.Birthday;
  }
  public String getSex(){
	  return this.Sex;
  }
  public int getAge(){
	  return this.Age;
  }
  public String getNum(){
	  return this.Qnumber;
  }
  public String getName(){
	  return this.Qname;
  }
  public String getPass(){
	  return this.Qpassword;
  }
  public String getPhone(){
	  return this.Qphone;
  }
  public String getDescription(){
	  return this.Skill+this.Age;
  }
  public String getLastEducation(){
	  return this.LastEducation;
  }
  public String getGraduate(){
	  return this.Graduate;
  }
  public String getHomeland(){
	  return this.homeland;
  }
  public String getSkill(){
	  return Skill;
  }
  /*
   * 各个属性的set和get方法
   * 
   */
}
