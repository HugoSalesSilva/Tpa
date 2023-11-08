import java.util.Scanner;
public class Principal {
	
 public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Conta c = new Conta();
		Cliente cl= new Cliente();
		Corrente co= new Corrente();
		Poupança po= new Poupança();
		
		co.setTaxa(10);
		po.setTaxa(1.5);
		
		System.out.println("Cliente ");
		System.out.println("Digite o Nome: ");
		cl.setNome(in.nextLine());
	
		
		System.out.println("Digite o Cpf: ");
		cl.setCpf(in.next());
		
		System.out.println("Dados do cliente");
		System.out.println("==================");
		System.out.println("Nome: "+cl.getNome());
		System.out.println("CPF: "+cl.getCpf());
		
		co.cliente = cl;
		po.cliente = cl;
				
		System.out.println("\nConta corrente");

		System.out.println("Insira o número da conta:");
		co.setNumero(in.next());
		
	    in.nextLine();
				
		System.out.println("Insira o nome da agência:");
		co.setAgencia(in.nextLine());
		
		System.out.println("Insira o saldo da conta:");
		co.setSaldo(in.nextDouble());
		
		System.out.println("Insira o limite da conta:");
		co.setLimite(in.nextDouble());
		
		System.out.println("Insira o valor a ser sacado:");
				
		if(co.sacar(in.nextDouble())) {
			System.out.println("Saque feito com sucesso.");
		}else {
			System.out.println("Saque não foi realizado.");
		}
				
		System.out.println("O seu saldo é: "+co.consultarSaldo());
		
		System.out.println("O seu limite é: "+co.getNovolimite());
				
		System.out.println("Insira o valor a ser depositado:");
		co.depositar(in.nextDouble());
		
		ControledeTaxas.registraOperacao(co);
		co.sacar(co.getTaxa());
		
		System.out.println("O seu saldo é: "+co.consultarSaldo());
		
		System.out.println("O seu limite é: "+co.getNovolimite());
		
		System.out.println();

		System.out.println("Informações da conta corrente");
		System.out.println("==================");
		System.out.println("Nome: "+cl.getNome());
		System.out.println("CPF: "+cl.getCpf());
		System.out.println("Número: "+co.getNumero());
		System.out.println("Agência: "+co.getAgencia());
		System.out.println("Saldo: "+co.getSaldo());
		System.out.println("Valor do limite disponivel: "+co.getNovolimite());
		System.out.println("Valor da taxa: "+co.getTaxa());
		
				
		
		System.out.println("\nConta poupança");

		System.out.println("Insira o número da conta:");
		po.setNumero(in.next());
		
		System.out.println("Insira o nome da agência:");
		po.setAgencia(in.next());
		
		System.out.println("Insira o valor do saldo:");
		po.setSaldo(in.nextDouble());
		
		System.out.println("Insira o valor do rendimento:");
		po.setRendimento(in.nextDouble());
		
		System.out.println("Insira o dia do aniversário:");
		po.setDiaAniversario(in.nextInt());
		
		
		System.out.println("Insira o valor a ser sacado:");
		if(po.sacar(in.nextDouble())) {
			System.out.println("Saque feito com sucesso.");
		}else {
			System.out.println("Saque não foi realizado.");
		}
		System.out.println("O seu saldo é: "+po.consultarSaldo());
		System.out.println();

		System.out.println("Insira o valor a ser depositado:");
		po.depositar(in.nextDouble());
		
		ControledeTaxas.registraOperacao(po);
		po.sacar(po.getTaxa());
		
		System.out.println("O seu saldo é: "+po.consultarSaldo());
		System.out.println();
		
		System.out.println("Informações da conta poupança");
		System.out.println("==================");
		System.out.println("Nome:"+ cl.getNome ());
		System.out.println("Cpf:"+ cl.getCpf ());
		System.out.println("Número:"+ po.getNumero ());
		System.out.println("Agencia:"+ po.getAgencia ());
		System.out.println("Saldo:"+ po.getSaldo ());
		System.out.println("valor Rendimento:"+ po.getRendimento());
		System.out.println("Dia do Aniversario:"+ po.getDiaAniversario() );
		System.out.println("Valor da taxa: "+po.getTaxa());
}
		
		
 }
