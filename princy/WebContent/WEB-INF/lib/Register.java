import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customername=request.getParameter("customername");
		String loantype=request.getParameter("loantype");
		String loanid=request.getParameter("loanid");
		String amount=request.getParameter("amount");
		String bankruptcyid=request.getParameter("bankruptcyid");
		String aadharno=request.getParameter("aadharno");
		String accountno=request.getParameter("accountno");
		Member member=new Member(customername,loantype,loanid,amount,bankruptcyid,aadharno,accountno);
		RegisterDao rDao=new RegisterDao();
		String result=rDao.insert(member);
		response.getWriter().append(result);
   }
}

