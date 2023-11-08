package Controller;

import model.ClienteModel;

public class ClienteController {
	
		public boolean cadastraCliente(String nome, String cpf, String dataNasc) {
			
			if(nome!=null && nome.length()!=0 && cpf!=null && cpf.length()==14 && dataNasc!=null && dataNasc.length()== 10 && !dataNasc.contains(" ") && !cpf.contains(" ")) {
			
			ClienteModel cliente = new ClienteModel(nome, cpf, dataNasc);
			cliente.cadastraCliente(cliente);
			
			return true;
			}
			return false;
	 }		
	
}
