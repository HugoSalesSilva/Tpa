import javax.swing.*; 
public class Exercicio4 {
	public static void main(String[] args) {
		
		
		int num, escolha;
		
		
		do {
			
			num=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero"));
			if(num%2==0) {
				JOptionPane.showMessageDialog(null, "O n�mero � par");
			}else {
				JOptionPane.showMessageDialog(null, "O n�mero � impar");
			}
			
			escolha=JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha uma op��o", JOptionPane.YES_NO_OPTION);
		
		}while(escolha==0);
		JOptionPane.showMessageDialog(null,"O programa parou");
		
	}
}
