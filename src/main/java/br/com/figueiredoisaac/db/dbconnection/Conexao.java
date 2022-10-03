package main.java.br.com.figueiredoisaac.db.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/pet?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "Isaac@mysql00*";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		try{
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(ClassNotFoundException | SQLException ex){

			System.out.println(ex);

			return null;
		}
	}
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		throw new UnsupportedOperationException("Operação não suportada");
		
	}
}
