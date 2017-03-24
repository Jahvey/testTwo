package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.*
;/**
 * Servlet implementation class turnPage
 */
public class turnPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public turnPage() {
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
		String page=request.getParameter("page");
		HttpSession session=request.getSession();
		Object current=session.getAttribute("currentPage");
		int curPage=current==null? 1:(Integer) current;
		System.out.println("turnPage1-1");
		if(curPage==1&&page.equals("-1")){
			System.out.println("turnPage1-2");
			TurnPageService turnPage=new TurnPageService();
			request.setAttribute("list", turnPage.turnPage(curPage));
			session.setAttribute("currentPage", page+1);
			
		}
		else{
			session.setAttribute("currentPage", curPage);
		}
		
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
