import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class File
 */
@WebServlet("/File")
public class File extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public File() {
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
		String courtname=request.getParameter("courtname");
		String courtid=request.getParameter("courtid");
		String customername=request.getParameter("customername");
		String customerid=request.getParameter("customerid");
		String attorneyname=request.getParameter("attorneyname");
		String attorneyaddress=request.getParameter("attorneyaddress");
		String loantype=request.getParameter("loantype");
		String loanid=request.getParameter("loanid");
		String loanamount=request.getParameter("loanamount");
		Leader leader=new Leader(courtname,courtid,customername,customerid,attorneyname,attorneyaddress,loantype,loanid,loanamount);
		FileDao fDao=new FileDao();
		String result=fDao.insert(leader);
		response.getWriter().print(result);
		}

}
