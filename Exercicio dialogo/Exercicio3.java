import javax.swing.*;  
public class Exercicio3 {
	 public static void main(String[] args) {
		 double Salario;
		 double ValorReajuste,Receber;
		 int Reajuste;
		 String Nome;


		 	Nome = JOptionPane.showInputDialog(null,"Quanto é o seu nome?","Nome",JOptionPane.QUESTION_MESSAGE);
			Salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto é o seu salario?","Salario",JOptionPane.QUESTION_MESSAGE));
			Reajuste = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a seu porcentual do Reajuste?","Reajuste",JOptionPane.QUESTION_MESSAGE));
			ValorReajuste = Salario/100*Reajuste;
			Receber = Salario+ValorReajuste;
			JOptionPane.showMessageDialog(null,"Nome:"+Nome+"\n Salario:"+Salario+"\n Porcentual de Reajuste"+Reajuste+"% \n Valor do Reajuste"+ValorReajuste+"\n Salario com Reajuste"+Receber, "Menu", JOptionPane.INFORMATION_MESSAGE);
	 }
}
