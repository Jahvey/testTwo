package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.submitResume;
import bean.zhaopin;
import dao.submitResumeDao;
import dao.zhaopinDao;

/**
 * Servlet implementation class interviewInvit
 */
public class interviewInvit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public interviewInvit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String Qnum=request.getParameter("Qnum");
		String Pnum=request.getParameter("Pnum");
		submitResumeDao dateDao=new submitResumeDao();
		submitResume date=new submitResume();
		date=dateDao.queryResumeByPAndQId(Pnum,Qnum);
		date.setResult("true");
		String sql="update submitresume set result='"+date.getResult()+"' where ID="+String.valueOf(date.getId());
		dateDao.updateResume(sql);
		request.getRequestDispatcher("turnToJobDesc?Pnum="+Pnum).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
