
public class Conta {
	Cliente cliente;

	private String numero;
	private String agencia; 
	private double saldo;
	private Cliente titular;
	private double taxa;
	
	public Conta(){	}
	
	Conta(String agencia, String numero, Cliente titular, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean sacar (double valor) {
		if(getSaldo() < valor ) {
			System.out.println("Saldo Insuficiente");
			return false;
		}else {
			setSaldo (this.saldo-valor);
			return true;
		}
		
		
		}
	public boolean depositar (double valor) {
		
		
		setSaldo (this.saldo+valor);
		return true;
	}
	public double consultarSaldo() {
		
	return this.saldo;
	}
}

