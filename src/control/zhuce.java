package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
import dao.*;
/**
 * Servlet implementation class zhuce
 */
public class zhuce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zhuce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String  dif=request.getParameter("dif");
		qiuzhi dategeren=new qiuzhi();
		qiye dateqiye=new qiye();
		
		if(dif.equals("geren")){
			String Qnumber=request.getParameter("Qnumber");
			qiuzhiDao daoqiuzhi=new qiuzhiDao();
			List<qiuzhi> listqiuzhi=new ArrayList<qiuzhi>();
			listqiuzhi=daoqiuzhi.queryAllqiuzhi();
			for(int i=0;i<listqiuzhi.size();i++){
				System.out.println("testzhuce1-1");
		    	if(Qnumber.equals(listqiuzhi.get(i).getNum()))
		    		{
		    		  out.println("alert('该账号已存在')");
		    	      break;
		    		}
			 }
		    	
		    		
		    		String Qname=request.getParameter("Qname");
		    		String Qphone=request.getParameter("Qphone");
		    		
		    		int Qage=Integer.parseInt(request.getParameter("Qage"));
		    		String Qsex=request.getParameter("Qsex");
		    		String Qaddress=request.getParameter("Qaddress");
		    		String Qdescription=request.getParameter("Qskill");
		    		String Qpass=request.getParameter("pass21");
		    		String Qpass2=request.getParameter("pass22");
		    		System.out.println(Qpass+"---"+Qpass2);
		    		if(Qpass.equals(Qpass2)){
		    			System.out.println("testzhuce1-2");
		    			dategeren.setQnumber(Qnumber);
		    			dategeren.setName(Qname);
		    			dategeren.setPhone(Qphone);
		    			dategeren.setHomeland(Qaddress);
		    			dategeren.setSkill(Qdescription);
		    			dategeren.setQpassword(Qpass);
		    			dategeren.setAge(Qage);
		    			System.out.println("testzhuce1");
		    			daoqiuzhi.pushAqiuzhi( dategeren);
		    			qiuzhiDao date=new qiuzhiDao();
						qiuzhi use=date.queryByIdqiuzhi(Qnumber);
						HttpSession session=request.getSession();
						session.setAttribute("user", use.getName());
						session.setAttribute("use", use);
		    			request.getRequestDispatcher("personInfo.jsp").forward(request, response);
		    		}
		    		else{
		    			out.println("alert('重复输入的密码不同')");
		    		}
		    	}
		   
			
		
		else{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
