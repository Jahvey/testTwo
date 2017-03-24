package bean;

public class zhaopin {
  private qiye owner;
  private String ownerNum;
  private int Pnumber;
  private String Pname;
  private String limit;
  private String slavery;
  private int num;
  private String time;
  public zhaopin(){}
  public zhaopin(qiye owner){
	  this.owner=owner;
  }
  public void setOwner(qiye date){
	  this.owner=date;
  }
  
  public void setOwnerNum(String num){
	  this.ownerNum=num;
  }
  public void setPnumber(int pnum){
	  this.Pnumber=pnum;
  }
  public void setPname(String name){
	  this.Pname=name;
  }
  public void setLimit(String limit){
	  this.limit=limit;
  }
  public void setSlavery(String slavery){
	  this.slavery=slavery;
  }
  public void setNum(int num){
	  this.num=num;
  }
  public void setTime(String time){
	  this.time=time;
  }
  public qiye getOwner(){
	  return owner;
  }
  public String getOwnerNum(){
	  return ownerNum;
  }
  public int getPnumber(){
	  return Pnumber;
  }
  public String getPname(){
	  return Pname;
  }
  public String getLimit(){
	  return limit;
  }
  public String getSlavery(){
	  return slavery;
  }
  public int getNum(){
	  return num;
  }
  public String getTime(){
	  return time;
  }
  /*
   * �������Ե�set��get����
   */
}
