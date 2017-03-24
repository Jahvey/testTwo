package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import bean.*;
/**
 * Servlet implementation class fastPage
 */
public class fastPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fastPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        List<zhaopin> list;
	    
		zhaopinDao date=new zhaopinDao();
		list=date.queryAllzhaopinList();
		//System.out.println(list.size());
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getPname());
			list.get(i).setOwner(date.queryOwnerById(list.get(i).getOwnerNum()));
			
		}
		//PrintWriter out = response.getWriter();
		//response.setContentType("text/html;charset=UTF-8");
		//System.out.println("test5-1");
	    request.setAttribute("date", list);
	    System.out.println("test5"+list.get(1).getPname());
	    request.getRequestDispatcher("mainPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
