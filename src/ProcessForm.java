

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import UserCheck.User;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
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
		response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      String message;
	      message = "Hello World";
	      String message1 = request.getParameter("first_name");
	      String message2 = request.getParameter("password");
	      out.println("<h1>" + message + "</h1>\n"); 
	      out.println("<h2>" + message1 + "</h2>\n"); 
	      out.println("<h2>" + message2 + "</h2>\n");
	      User u = new User();
	      u.setName(message1);
	      u.setpassword(message2);
	      String nextURL ="";
	      if (u.isvaliduser())
      	  {
	    	  HttpSession session = request.getSession();
	    	  session.setAttribute("user", u);
//	    	  nextURL = "/output.jsp?first_name=" + message1 + "&password=" + message2;  
	    	  nextURL = "/output.jsp";
      	  }
	      else
	    	  nextURL = "/Login.html";
	      
	    response.sendRedirect(request.getContextPath() + nextURL);

	}

}
