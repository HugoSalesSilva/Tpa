package Controller;

import Model.ClienteModel;

public class ClienteController {
	
		public boolean cadastraCliente(String nome, String cpf, String dataNasc, String numLog, String cidade, String uf, String cep, String telefone, String email) {
			
			if(nome!=null && nome.length()!=0 && email!=null && email.length()!=0 && uf!=null && uf.length()!=0 && cidade!=null && cidade.length()!=0 && numLog!=null && numLog.length()!=0 && cpf!=null && cpf.length()==14 && dataNasc!=null && dataNasc.length()== 8 && !dataNasc.contains(" ") && !cpf.contains(" ") && telefone!=null && telefone.length()== 14 && !telefone.contains(" ")&& cep!=null && cep.length()== 9 && !cep.contains(" ")  ) {
			
			ClienteModel cliente = new ClienteModel(nome, cpf, dataNasc, numLog,  cidade,  uf,  cep,  telefone,  email);
			cliente.cadastraCliente(cliente);
			
			return true;
			}
			return false;
	 }		
	
}