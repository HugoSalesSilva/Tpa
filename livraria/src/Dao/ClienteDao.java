package Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.ClienteModel;

public class ClienteDao {
	
	private Connection connection; 
	
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void CadastrarCliente(ClienteModel cliente) throws SQLException {
		
		try {
			String sql = "Insert into cliente" +
						"(nome, cpf, dataNasc, email, telefone, numLog, cidade, uf, cep) " +
					"values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNasc());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getTelefone());
			stmt.setString(6, cliente.getNumLog());
			stmt.setString(7, cliente.getCidade());
			stmt.setString(8, cliente.getUf());
			stmt.setString(9, cliente.getCep());
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Todos os dados foram inseridos na tabela. (DAO)");
			
	}catch(SQLException e) {
		JOptionPane.showMessageDialog(null, "ERRO: "+ e);
	
	}finally {
		connection.close();
		}
	}
	public List<ClienteModel> getLista() throws SQLException{
		
		
		try { 
			List<ClienteModel> cliente = new ArrayList<ClienteModel>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from cliente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ClienteModel ClienteModel = new ClienteModel();
				ClienteModel.setId(rs.getInt(1));
				ClienteModel.setNome(rs.getString(2));
				ClienteModel.setEmail(rs.getString(3));
				ClienteModel.setTelefone(rs.getString(4));
				ClienteModel.setCep(rs.getString(5));
				ClienteModel.setCpf(rs.getString(6));
				ClienteModel.setDataNasc(rs.getString(7));
				ClienteModel.setUf(rs.getString(8));
				ClienteModel.setCidade(rs.getString(9));
				ClienteModel.setNumLog(rs.getString(10));
				cliente.add(ClienteModel);
			}
			rs.close();
			stmt.close();
			return cliente;
		}
		catch(SQLException e){
			JOptionPane.showMessageDialog(null, "ERRO: "+ e);
			throw new RuntimeException();
			
		}finally {
			connection.close();
		}
	}
}
