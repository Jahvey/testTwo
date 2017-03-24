package service;
import dao.*;
import bean.*;
public class loginService {
	private qiuzhiDao daoqiuzhi;
	private qiyeDao daoqiye;
	public loginService(){
		daoqiuzhi = new qiuzhiDao();
		daoqiye=new qiyeDao();
	}
	public boolean checkLogin(String account, String password, String type){
		if (type.equals("geren")){
			
			qiuzhi date=new qiuzhi();
			date=daoqiuzhi.queryByIdqiuzhi(account);
			System.out.println("test4");
			if(date.getPass().equals(password))
			   return true;
			else 
				return false;
		}else{
			qiye date=new qiye();
			date=daoqiye.queryByIdqiye(account);
			System.out.println("test4-2");
			if(date.getPass().equals(password))
			    return true;
			else
				return false;
		}
	}
    public qiuzhi getqiuzhiDate(String account){
    	return daoqiuzhi.queryByIdqiuzhi(account);
    	//还有返回企业版的dao
    }
    public qiye getqiyeDate(String account){
    	return daoqiye.queryByIdqiye(account);
    }
}
