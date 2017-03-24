package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.submitResume;
import dao.qiuzhiDao;
import dao.submitResumeDao;

/**
 * Servlet implementation class turnToJobDesc
 */
public class turnToJobDesc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public turnToJobDesc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String Qnum=request.getParameter("Qnum");
		int Pnum=Integer.parseInt(request.getParameter("Pnum"));
		
		qiuzhiDao manDao=new qiuzhiDao();
    	HttpSession session=request.getSession();
		submitResumeDao resumeDao=new submitResumeDao();
		session.setAttribute("manDao", manDao);
		session.setAttribute("Pnum", Pnum);
    	session.setAttribute("resumeDao", resumeDao);
		List<submitResume> list=resumeDao.queryResumeByPnum(Pnum);
		System.out.println(list.size()+"--------");
		request.getSession().setAttribute("list", list);
		request.getRequestDispatcher("jobDescription.jsp?").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
