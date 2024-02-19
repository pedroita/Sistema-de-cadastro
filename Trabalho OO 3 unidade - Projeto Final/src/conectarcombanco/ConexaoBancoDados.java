package conectarcombanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/fichadosalunos","","");
		} catch (SQLException e) {
			System.out.println("Problemas em estabelecer  coneção " + e.toString() );
		}
		
		return null;
	
	}
}
