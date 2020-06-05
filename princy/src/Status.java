import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Status
 */
@WebServlet("/Status")
public class Status extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Status() {
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
		// TODO Auto-generated method stub
		String customername=request.getParameter("customername");
		String customerid=request.getParameter("customerid");
		String bankid=request.getParameter("bankid");
		String meetingdays=request.getParameter("meetingdays");
		String loantype=request.getParameter("loantype");
		String loanamount=request.getParameter("loanamount");
		String loanid=request.getParameter("loanid");
		Verify verify=new Verify(customername,customerid,bankid,meetingdays,loantype,loanamount,loanid);
		StatusDao sDao=new StatusDao();
		String result=sDao.insert(verify);
		response.getWriter().print(result);
		
		
	}

}
