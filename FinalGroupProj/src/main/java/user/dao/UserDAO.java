package user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import busmanagement.db.ConnectionManager;
import user.model.*;

public class UserDAO {
	//important
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement statement = null;
	static ResultSet rs = null;
	
	//Admin
	private static int adminid;
	private String adminname;
	private static String adminpassword;
	private String adminphoneno;
	private String adminemail;
	
	//ADMIN METHODS DAO - MUST HAVE ITS CONTROLLER
	//1.0 LOGIN ADMIN
	public static admin loginAdmin(admin a) {
		
		adminid = a.getAdminid();
		adminpassword = a.getAdminpassword();
		
		try {
			con = ConnectionManager.getConnection();

			//CREATE STATEMENT
			ps = con.prepareStatement("SELECT * FROM staff WHERE adminid = ? AND adminpassword = ?");
			ps.setInt(1, adminid);
			ps.setString(2, adminpassword);

			//EXECUTE QUERY
			rs = ps.executeQuery();
			if(rs.next()) {
				a.setAdminid(rs.getInt("adminid"));
				a.setValid(true);
			}
			else {
				a.setValid(false);
			}

			//CLOSE CONNECTION
			con.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return a;	
	}
	
	//2.0 GET ADMIN BY ADMINID
	public static Object getAdminByadminid(int adminid) {

		admin admin = new admin();
		
		try {
			//CONNECT TO DB
			con = ConnectionManager.getConnection();

			//CREATE STATEMENT
			ps = con.prepareStatement("SELECT * FROM staff WHERE adminid = ?");
			ps.setInt(1, adminid);

			//EXECUTE QUERY
			rs = ps.executeQuery();

			if(rs.next()) {
				admin.setAdminid(rs.getInt("adminid"));
				admin.setAdminname(rs.getString("adminname"));
				admin.setAdminphoneno(rs.getString("adminphoneno"));
				admin.setAdminemail(rs.getString("adminemail"));
			}

			//CLOSE CONNECTION
			con.close();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}
	
	
}
