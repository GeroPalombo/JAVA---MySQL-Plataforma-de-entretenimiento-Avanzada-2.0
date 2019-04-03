package com.pde.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.pde.db.DataBase.*;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("La conexion con la base de datos fue exitosa");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			return connection;
		}
		
	}

}