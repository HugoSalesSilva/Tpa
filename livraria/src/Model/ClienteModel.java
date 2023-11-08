package Model;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import Dao.ClienteDao;
public class ClienteModel {
	private String nome;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String cpf;
	private String dataNasc;
	private String numLog;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String email;

	
	public ClienteModel() {}
		public ClienteModel(String nome, String cpf, String dataNasc, String numLog, String cidade, String uf, String cep, String telefone, String email) {
			this.nome = nome;
			this.cpf = cpf;
			this.dataNasc=dataNasc;
			this.numLog = numLog;
			this.cidade = cidade;
			this.uf=uf;
			this.cep = cep;
			this.telefone = telefone;
			this.email=email;
		
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
		public String getNumLog() {
			return numLog;
		}
		public void setNumLog(String numLog) {
			this.numLog = numLog;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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

