import javax.swing.JOptionPane;
public class Exercicio2 {

		public static void main(String[] args) {
			int numero, i=1, resultado;
			String r="";
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero","Tabuada",JOptionPane.QUESTION_MESSAGE));
			
			while (i <=10) {
			resultado = numero * i;
			
			r+=numero+" x "+i+" = "+resultado+"\n";
			i++;
			
			
			}
		
			JOptionPane.showMessageDialog(null,"Tabuada \n"+r, "Tabuada", JOptionPane.INFORMATION_MESSAGE);


			
		}
}
