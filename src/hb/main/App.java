package hb.main;

import java.sql.Connection;
import java.sql.SQLException;

import hb.utils.DataConnect;

public class App {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			con = DataConnect.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
