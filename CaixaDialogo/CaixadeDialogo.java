import javax.swing.*;  
public class CaixadeDialogo {
	
 public static void main(String[] args) {
	 double Fixo;
	 double Unitario;
	 double Comissao;
	 double Receber;
	 int qtdVendida;

		
		Fixo = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto � o seu salario fixo?","Salario fixo",JOptionPane.QUESTION_MESSAGE));
		Unitario = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor de cada pe�a?","Valor pe�a",JOptionPane.QUESTION_MESSAGE));
		Comissao = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a sua comiss�o?","Comiss�o",JOptionPane.QUESTION_MESSAGE));
		qtdVendida = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas pe�as foram vendidas?","Quantidade",JOptionPane.QUESTION_MESSAGE));
		
		Receber = Fixo+((Unitario*qtdVendida)*Comissao/100);
		JOptionPane.showMessageDialog(null,"voce ira receber:RS "+Receber, "Receber", JOptionPane.INFORMATION_MESSAGE);
		
		Object[] options = {"MA�A","MAM�O","ABACAXI"};
		JOptionPane.showInputDialog(null, "Selecione a fruta desejada", "Casa do suco",JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
		
		Object[] op�ao = {"CONFIRMAR","CANCELAR","VOLTAR"};
		JOptionPane.showOptionDialog(null,"Deseja confirmar a compra", "Carrinho de Compras", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,op�ao,op�ao[0]);
}
 }
