package MVCServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("user");
		String passwd=request.getParameter("passwd");
		 
		model.Login obj=new model.Login();
		obj.setUname(uname);
		obj.setPasswd(passwd);
		if(obj.isValidLogin())
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("Success.jsp");
		dispatch.forward(request,response);
		}
		else{
			RequestDispatcher dispatch=request.getRequestDispatcher("Error.jsp");
			dispatch.forward(request,response);
			
		}
			
		}

	}


