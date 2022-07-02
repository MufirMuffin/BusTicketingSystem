package busmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Time;

import busmanagement.db.ConnectionManager;
import busmanagement.model.*;

import user.model.*;

public class BusManagementDAO {
	static Connection con = null;
	static PreparedStatement ps=null;
	static Statement statement = null;
	static ResultSet rs = null;
	user user;
	admin admin;
	int tripid, busid, adminid, bookingid, id;
	String departure, destination, buscompany, drivername, phoneno, email,plateno;
	Date date;
	Time time;
	double price;
	
	//add trip
	public void addTrip(trip trip,admin admin, bus bus) {
		java.util.Date utilDate = trip.getDate();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		adminid = admin.getAdminid();
		busid = bus.getBusid();
		tripid = trip.getTripid();
		departure = trip.getDeparture();
		destination = trip.getDestination();
		buscompany = bus.getBuscompany();
		price = trip.getPrice();
		drivername = bus.getDrivername();
		plateno = bus.getPlateno();
		try {
			con = ConnectionManager.getConnection();
			//create statement
			ps = con.prepareStatement("INSERT INTO 'trip' ('tripid','adminid','busid','departure','destination','date','time') VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1, tripid);
			ps.setInt(2, adminid);
			ps.setInt(3, busid);
			ps.setString(4, departure);
			ps.setString(5, destination);
			ps.setDate(6, sqlDate);
			ps.setTime(7, time);
			
			ps.executeUpdate();
			System.out.println("Successfully add new trip");
			
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	}// end of add trip
	
	
	//get list of trip by trip id
	public static List<trip> getListTrip(int tripid){
		
		List<trip> trips = new ArrayList<trip>();
		
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement("SELECT * FROM trip WHERE stu_no = ?");
			ps.setInt(1, tripid);
			
			rs = ps.executeQuery();

			while(rs.next()) {
				trip t = new trip();
				t.setTripid(rs.getInt("tripid"));
				t.setAdminid(rs.getInt("adminid"));
				t.setDate(rs.getDate("date"));
				t.setDeparture(rs.getString("departure"));
				t.setDestination(rs.getString("destination"));
				t.setPrice(rs.getDouble("price"));
				trips.add(t);
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return trips;	
	}//end of list of trip by trip id
	
	//get all trip 
	public static List<trip> getAllTrip(){
		List<trip> trips = new ArrayList<trip>();
		
		try{
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement("SELECT * FROM trip");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				trip t = new trip();
				t.setTripid(rs.getInt("tripid"));
				t.setAdminid(rs.getInt("adminid"));
				t.setBusid(rs.getInt("busid"));
				t.setDeparture(rs.getString("departure"));
				t.setDestination(rs.getString("destination"));
				t.setDate(rs.getDate("date"));
				t.setTime(rs.getTime("time"));
				t.setPrice(rs.getDouble("price"));
				trips.add(t);
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return trips;
	}//end of list
	
	//update trip
	public void updateTrip (trip trip, admin admin, bus bus) {
		java.util.Date utilDate = trip.getDate();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		adminid = admin.getAdminid();
		busid = bus.getBusid();
		tripid = trip.getTripid();
		departure = trip.getDeparture();
		destination = trip.getDestination();
		buscompany = bus.getBuscompany();
		price = trip.getPrice();
		drivername = bus.getDrivername();
		plateno = bus.getPlateno();
		try {
			con = ConnectionManager.getConnection();
			//create statement
			ps = con.prepareStatement("UPDATE trip SET tripid=?, adminid=? , busid=?, departure=? , destination=? , date=?, time=?) VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1, tripid);
			ps.setInt(2, adminid);
			ps.setInt(3, busid);
			ps.setString(4, departure);
			ps.setString(5, destination);
			ps.setDate(6, sqlDate);
			ps.setTime(7, time);
			
			ps.executeUpdate();
			
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	}//end of update trip
		
	//delete trip
	public void deleteTrip(int tripid) {
		
		try {
			//CONNECT TO DB
			con = ConnectionManager.getConnection();

			//CREATE STATEMENT
			ps = con.prepareStatement("DELETE FROM trip WHERE tripid = ?");
			ps.setInt(1, tripid);

			//EXECUTE QUERY
			ps.executeUpdate();

			//CLOSE CONNECTION
			con.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//create booking
	public void addBook (booking booking, user user, trip trip) {
		bookingid = booking.getBookingid();
		id = user.getId();
		tripid = trip.getTripid();
		phoneno = user.getPhoneno();
		email = user.getEmail();
		
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement("INSERT INTO booking(bookingid,id,tripid) values(?,?,?)");
			ps.setInt(1, bookingid);
			ps.setInt(2, id);
			ps.setInt(3, tripid);
			
			ps.executeUpdate();
			System.out.println("Successfully create booking id");
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//end booking
	
	
	
}
