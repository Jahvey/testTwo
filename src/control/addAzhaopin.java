package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.zhaopin;
import dao.zhaopinDao;

/**
 * Servlet implementation class addAzhaopin
 */
public class addAzhaopin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAzhaopin() {
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
		String name=request.getParameter("name");
		int num=Integer.parseInt(request.getParameter("num"));
		String slavery=request.getParameter("slavery"); 
		String limit=request.getParameter("limit");
		String time=request.getParameter("time");
		String ownerNum=request.getParameter("ownerNum");
		System.out.println("11-0");
		zhaopin date=new zhaopin();
		zhaopinDao dao=new zhaopinDao();
		date.setLimit(limit);
		date.setNum(num);
		date.setOwnerNum(ownerNum);
		date.setSlavery(slavery);
		date.setTime(time);
		date.setPname(name);
		System.out.println("11-1");
		List<zhaopin> list=dao.queryAllzhaopinList();
		System.out.println("11-2");
		int le=list.get(list.size()-1).getPnumber();	
		date.setPnumber((le+1));
		
		dao.addAjob(date);
		System.out.println("11-3");
		request.getRequestDispatcher("qiyeInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
