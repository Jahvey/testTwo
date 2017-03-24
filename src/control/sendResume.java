package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.qiuzhi;
import bean.submitResume;
import dao.submitResumeDao;
/**
 * Servlet implementation class sendResume
 */
public class sendResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendResume() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(request.getParameter("para"));
		int para=Integer.parseInt(request.getParameter("para"));
		System.out.println("submit1-1"+para);
		HttpSession session=request.getSession();
		String userNum=(String)session.getAttribute("userNum");
		submitResume resumeDate=new submitResume();
		resumeDate.setQnumber(userNum);
		resumeDate.setPnumber(para);
		submitResumeDao resumeDao=new submitResumeDao();
		//resumeDate.setID(resumeDao.getsubmitResumeNum()+1);
		List<submitResume> list=resumeDao.queryAllSubmitResume();
		System.out.println(list.get(list.size()-1).getId());
		int num=list.get(list.size()-1).getId()+1;
		resumeDate.setID(num);
		resumeDao.pushAResume(resumeDate);
		System.out.println("submit1-3");
		request.getRequestDispatcher("fastPage").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
