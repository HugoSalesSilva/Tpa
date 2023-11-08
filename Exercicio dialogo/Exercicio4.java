import javax.swing.*; 
public class Exercicio4 {
	public static void main(String[] args) {
		
		
		int num, escolha;
		
		
		do {
			
			num=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero"));
			if(num%2==0) {
				JOptionPane.showMessageDialog(null, "O número é par");
			}else {
				JOptionPane.showMessageDialog(null, "O número é impar");
			}
			
			escolha=JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha uma opção", JOptionPane.YES_NO_OPTION);
		
		}while(escolha==0);
		JOptionPane.showMessageDialog(null,"O programa parou");
		
	}
}
