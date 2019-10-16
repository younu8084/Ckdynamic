package codejava.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controller")
public class Controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 	
		String trigerFrom = req.getParameter("bookButton");	
		if (trigerFrom.equals("check")) 
		{
		    	String opt= req.getParameter("Currency");
		    	String num=req.getParameter("num");
			int n=Integer.parseInt(num);
			Bean b=new Bean(opt,n);
			b.curr();
			PrintWriter out= resp.getWriter();
			out.println("<h1>"+num+"Equivalent Indian Rupee is"+b.getRes()+"</h1>");
			out.close();			
		} 
	}
}
