package com.project.mini;
import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionTest {
Connection connection=null;
	public Connection getConnectionDetails(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project ","root","root");

		}catch (Exception e) {
	
	e.printStackTrace();
}

return connection;
	}

}
