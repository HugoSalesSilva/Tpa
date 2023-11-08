
public class Corrente extends Conta {

	private double limite, novolimite;
	
	
	public Corrente(){	}
	
	Corrente(String agencia, String numero, Cliente titular, double saldo){
		super (agencia, numero, titular, saldo);
		super.setTaxa(10);
	}

	

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
		this.novolimite = limite;
	}
	public double getNovolimite() {
		return novolimite;
	}
	public void setNovolimite(double novolimite) {
		this.novolimite = novolimite;
	}
	
	public boolean sacar(double valor) {
		if(getSaldo()+this.novolimite<valor) {
			System.out.println("Limite insuficiente");
			return false;
		}else {
			this.setSaldo(this.getSaldo()-valor);
			if(this.getSaldo()<0) {
				this.novolimite=this.novolimite+this.getSaldo();
				this.setSaldo(0);
			}
			return true;
		}
	}
	
	public boolean depositar(double valor) {
		
		this.novolimite=this.novolimite+valor;
		if(this.novolimite>this.limite) {
			valor=this.novolimite-this.limite;
			setSaldo(getSaldo()+valor);
			this.novolimite=this.limite;
		}
		
		return true;
	}
	

	
}
