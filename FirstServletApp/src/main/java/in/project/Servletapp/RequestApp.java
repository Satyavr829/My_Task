package in.project.Servletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestApp
 */
@WebServlet("/test")
public class RequestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static {
    	System.out.println("Servlet class is loading....");
    }

	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public RequestApp() {
        System.out.println("Servlet class is instation....");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 color='red'><marquee  direction = 'left'>Redirecting Page to request page...</marquee></h1>");
		//out.println("<marquee direction = 'up'>The direction of text will be from bottom to top.</marquee>");
		out.println("</body>");
		out.println("/html");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
