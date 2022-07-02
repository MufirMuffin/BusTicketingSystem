package busmanagement.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import busmanagement.model.*;
import busmanagement.dao.BusManagementDAO;
/**
 * Servlet implementation class AddTripController
 */
@WebServlet("/AddTripController")
public class AddTripController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BusManagementDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTripController() {
        super();
        dao = new BusManagementDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("admin/add_trip.jsp");
		view.forward(request, response);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		trip trip = new trip();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
		
		trip.setTripid(Integer.parseInt(request.getParameter("tripid")));
		trip.setAdminid(Integer.parseInt(request.getParameter("adminid")));
		trip.setBusid(Integer.parseInt(request.getParameter("busid")));
		trip.setDeparture(request.getParameter("departure"));
		trip.setDestination(request.getParameter("destination"));
		try {
			Date date = format.parse(request.getParameter("date"));
			Date time = format2.parse(request.getParameter("time"));
			trip.setDate((java.sql.Date) date);
			trip.setTime((java.sql.Time) time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trip.setPrice(Double.parseDouble(request.getParameter("price")));

		dao.addTrip(trip, null, null);
		
		request.setAttribute("trip", BusManagementDAO.getAllTrip());
		RequestDispatcher view = request.getRequestDispatcher("admin/list_trip.jsp");
		view.forward(request, response);
		
	}

}
