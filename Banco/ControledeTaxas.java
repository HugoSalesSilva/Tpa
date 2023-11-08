
public class ControledeTaxas {
	
	private static double somatorioTaxa=0;

	public static double getSomatorioTaxa() {
		return somatorioTaxa;
	}

	public static void setSomatorioTaxa(double somatorioTaxa) {
		ControledeTaxas.somatorioTaxa = somatorioTaxa;
	}
	public static void registraOperacao(Conta conta) {
		double taxa = conta.getTaxa();
		ControledeTaxas.somatorioTaxa = ControledeTaxas.somatorioTaxa + taxa;
	}
}
