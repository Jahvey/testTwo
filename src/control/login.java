package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.*;
import bean.*;
import dao.*;
/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String dif=request.getParameter("dif");
		System.out.println(dif+"heool");
		
		
		
		String user=request.getParameter("user1");
		String pass=request.getParameter("pass1");
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(3600);
		loginService login=new loginService();
		if(login.checkLogin(user, pass, dif)){
		    
			//request.setAttribute("zhaopin", login.getDate(user));
			System.out.println("test3");
			if(dif.equals("geren")){
				submitResumeDao resumeDao=new submitResumeDao();
				List<submitResume> list=resumeDao.queryResumeByQnum(user);
				System.out.println("test3-2");
				qiuzhiDao date=new qiuzhiDao();
				zhaopinDao jobDao=new zhaopinDao();
				qiuzhi use=date.queryByIdqiuzhi(user);
				System.out.println("test3-1");
				session.setAttribute("jobDao", jobDao);
				System.out.println(list.size()+"--------");
				session.setAttribute("list", list);
				session.setAttribute("user", use.getName());
				session.setAttribute("userNum", use.getNum());
				session.setAttribute("use", use);
		    request.getRequestDispatcher("personInfo.jsp").forward(request, response);
			}
		    else{
		    	qiyeDao date=new qiyeDao();
		    	zhaopinDao zhaopinDate=new zhaopinDao();
		    	//List<zhaopin> list=new ArrayList<zhaopin>();
		    	//list=zhaopinDate.queryAllzhaopinList();
		    	System.out.println("test12-0");
		    	qiye use=date.queryByIdqiye(user);
		    	qiuzhiDao manDao=new qiuzhiDao();
		    	submitResumeDao resumeDao=new submitResumeDao();
		    	System.out.println("test12-1");
		    	session.setAttribute("use", use);
		    	session.setAttribute("zhaopinDao", zhaopinDate);
		    	System.out.println("test12-2");
		    	session.setAttribute("user", use.getName());
		    	session.setAttribute("manDao", manDao);
		    	session.setAttribute("jobDao", zhaopinDate);
		    	session.setAttribute("resumeDao", resumeDao);
		    	System.out.println("test12-3");
			 request.getRequestDispatcher("qiyeInfo.jsp").forward(request, response);
		    }
		  }
		else{
			request.getRequestDispatcher("loginPage.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
