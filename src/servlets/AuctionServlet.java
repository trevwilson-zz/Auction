package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Control")
public class AuctionServlet extends HttpServlet {

	
	public AuctionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		
		if(request.getParameter("userId").equals("guest")){
			dispatcher = ctx.getRequestDispatcher("/auction.jsp");
			dispatcher.forward(request,response);
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		
		if(request.getParameter("username") != null){
			if(request.getParameter("username").equals("admin") && request.getParameter("password").equals("admin")){
				dispatcher = ctx.getRequestDispatcher("/adminView.jsp");
				dispatcher.forward(request,response);
			}
			else{
				dispatcher = ctx.getRequestDispatcher("/failedLogin.jsp");
				dispatcher.forward(request,response);
			}
		}
		
		if(request.getParameter("bidAmount") != null){
			//TODO: Update item's highest bid
			
		}
		
	}
}
