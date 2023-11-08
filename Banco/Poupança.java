
public class Poupança extends Conta {
	
	private double rendimento;
	private int diaAniversario;
	
	public Poupança(){	}
	
	Poupança(String agencia, String numero, Cliente titular, double saldo){
		super (agencia, numero, titular, saldo);
		super.setTaxa(1.5);
	}
	
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	@Override
	public boolean sacar(double valor) {
		if(super.getSaldo() < valor) {
			return false;
		}else {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}
	}

		
		
}
