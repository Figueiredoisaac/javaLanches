package main.java.br.com.figueiredoisaac.db.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import main.java.br.com.figueiredoisaac.db.dbconnection.Conexao;
import main.java.br.com.figueiredoisaac.db.model.bean.Lanches;

public class LanchesDAO {

	public void Adicionar(Lanches l) throws SQLException, ClassNotFoundException {
		Connection con = Conexao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO lanches VALUES ( ?, ?)");
			stmt.setInt(1, l.getId());
			stmt.setString(2, l.getNome());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			Conexao.closeConnection(con, stmt);
		}
	}

	public void Deletar(Lanches l) throws SQLException, ClassNotFoundException {
		Connection con = Conexao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM membros WHERE id = ?");
			stmt.setInt(1, l.getId());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void Atualizar(Lanches l) throws SQLException, ClassNotFoundException {
		Connection con = Conexao.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE membros SET nome = ? WHERE id = ?");
			stmt.setString(1, l.getNome());
			stmt.setInt(2, l.getId());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}
	
	public List<Lanches> ListarLanches() throws SQLException, ClassNotFoundException{
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Lanches>lanches = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM membros");
            rs = stmt.executeQuery();
            while(rs.next()){
                Lanches lan = new Lanches();
                lan.setId(rs.getInt("id"));
                lan.setNome(rs.getString("nome"));
                lanches.add(lan);
            }
        }catch(SQLException ex){
            Logger.getLogger(LanchesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lanches;
    }
}
