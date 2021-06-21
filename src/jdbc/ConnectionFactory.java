package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
	
	//private static final String DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://?useTimezone=true&serverTimezone=UTC"; 
	private static final String USER = " "; 
	private static final String SENHA = " "; 
	
	
	public static Connection getConnection() {
        try {
        	
        	// Class.forName(DRIVER); opcional dependendo da versao
        	
            return DriverManager.getConnection(
            		URL, USER, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o Banco de Dados!",e);
        }
	}

	public static void closeConnection(Connection banco) {
		/*if(banco != null)
		{
			try {
				banco.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
	
	public static void closeConnection(Connection banco, PreparedStatement stmt)
	{
		/*closeConnection(banco);
		
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
