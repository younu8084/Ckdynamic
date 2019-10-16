package codejava.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out= resp.getWriter();
			String trigerFrom = req.getParameter("bookButton");
			if (trigerFrom.equals("check")) {
			String opt= req.getParameter("Currency");
			String num=req.getParameter("num");
			int n=Integer.parseInt(num);
			Bean b=new Bean(opt,n);
			b.curr();
			out.println("<h1>"+num+"Equivalent Indian Rupee is"+b.getRes()+"</h1>");
			out.close();
			}

	}

}
