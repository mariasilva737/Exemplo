package exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaobd {
	static String url = "jdbc:postgresql://localhost:5432/Exemplo";
	static String user = "postgres";
	static String senha = "senhapadrao";
	static Connection con;

	public static Connection getConexao() throws SQLException{
		
	try {
		Class.forName("org.postgres.Driver");
		
		System.out.println("Driver deu certo");
	}
	catch (java.lang.ClassNotFoundException e) {
		System.out.println(e.getMessage());
		
		System.out.println("Driver deu errado!");
	}
	
		try {
			Class.forName("or.postgresql.Driver");
			if(con==null) {
				con = (Connection) DriverManager.getConnection(url, user, senha);
				System.out.println("Conexão deu certo!");
			}
			return con;

			
		}catch(ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
		
	
	}
}
