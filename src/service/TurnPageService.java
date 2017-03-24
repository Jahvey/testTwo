package service;
import dao.*;

import java.util.ArrayList;
import java.util.List;

import bean.*;
public class TurnPageService {
    public TurnPageService(){
    	
    }
    public List<zhaopin> turnPage(int page){
    	List<zhaopin> list1=new ArrayList<zhaopin>();
    	List<zhaopin> list2=new ArrayList<zhaopin>();
    	zhaopinDao date=new zhaopinDao();
    	list1=date.queryAllzhaopinList();
    	for(int i=0;i<4&&(((page-1)*4+i)<list1.size());i++){
    	list2.add(list1.get((page-1)*4+i));
    	}
    	return list2;
    }
}
