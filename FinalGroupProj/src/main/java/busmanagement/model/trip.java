package busmanagement.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Date;
import java.util.*;

public class trip {
	private int tripid;
	private int adminid;
	private int busid;
	private String departure;
	private String destination;
	private Date date;
	private Time time;
	private double price;
	public trip() {
		
	}

	public int getTripid() {
		return tripid;
	}

	public void setTripid(int tripid) {
		this.tripid = tripid;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
