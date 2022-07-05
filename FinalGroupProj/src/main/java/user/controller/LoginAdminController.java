package user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import user.dao.UserDAO;
import user.model.*;

@WebServlet("/LoginAdminController")
public class LoginAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginAdminController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		admin a = new admin();
		a.setAdminid(Integer.parseInt(request.getParameter("adminid")));
		a.setAdminpassword(request.getParameter("adminpassword"));
		
		//Login
		a = UserDAO.loginAdmin(a);
		//Validation
		if (a.isValid())
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("currentSessionUser", a.getAdminid());
			request.setAttribute("admin", UserDAO.getAdminByadminid(a.getAdminid()));
			
			//redirect to admin menu
			RequestDispatcher view = request.getRequestDispatcher("admin/menu_admin.jsp");
			view.forward(request, response);
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter a valid Admin No & Password", "Error Occurred", JOptionPane.WARNING_MESSAGE);
			response.sendRedirect("admin/signin_admin.jsp");
		}
	}
}
