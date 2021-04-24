package mvc.app.conexion;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Conexion {

	private static org.apache.tomcat.dbcp.dbcp2.BasicDataSource cn=null;
	
	private static DataSource getDataSource() {
		
		if(cn==null) {
			
			cn=new BasicDataSource();
			cn.setDriverClassName("com.mysql.cj.jdbc.Driver");
			cn.setUsername("root");
			cn.setPassword("1234");
			cn.setUrl("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC");
		}
		
		return cn;
	}
	
	public static Connection getConnection() throws SQLException {
		return getDataSource().getConnection();
	}
}
