package conectarcombanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/fichadosalunos","pedro","251288");
		} catch (SQLException e) {
			System.out.println("Problemas em estabelecer  cone��o " + e.toString() );
		}
		
		return null;
	
	}
}
