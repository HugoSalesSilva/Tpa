package Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.ClienteModel;

public class ClienteDao {
	
	private Connection connection; 
	
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void CadastrarCliente(ClienteModel cliente) throws SQLException {
		
		try {
			String sql = "Insert into tbCliente" +
						"(nomeCliente, cpfCliente, dataNascCliente) " +
					"values(?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNasc());
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Todos os dados foram inseridos na tabela. (DAO)");
			
	}catch(SQLException e) {
		JOptionPane.showMessageDialog(null, "ERRO: "+ e);
	
	}finally {
		connection.close();
		}
	}
}
