package model;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import Dao.ClienteDao;
public class ClienteModel {
	private String nome;
	private String cpf;
	private String dataNasc;
	
	public ClienteModel() {}
		public ClienteModel(String nome, String cpf, String dataNasc) {
			this.nome = nome;
			this.cpf = cpf;
			this.dataNasc=dataNasc;
		
		
	}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getDataNasc() {
			return dataNasc;
		}
		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}
		public void cadastraCliente(ClienteModel cliente) {
			JOptionPane.showMessageDialog(null, "Dados Recebidos com sucesso.");
			
			try {
				new ClienteDao().CadastrarCliente(cliente);
				}catch(SQLException e ) {
					JOptionPane.showMessageDialog(null, "Erro: " + e);
				}
			
		}
	}	

