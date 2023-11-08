
import javax.swing.*;
public class Exercicio5 {
	public static void main(String[] args) {
		String combustivel;
		double resultado, km,litrosporKm,litros, alcool, gasolina;
		
		
		Object[] options = {"Alcool","Gasolina"};
		
		combustivel = (String) JOptionPane.showInputDialog(null, "Selecione a tipo de combustivel desejada", "Combustivel", JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		km = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km?","KM",JOptionPane.QUESTION_MESSAGE));
		if(combustivel == options[0] ){
			alcool = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Alcool","Alcool",JOptionPane.QUESTION_MESSAGE));

			litrosporKm = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km por litro?","Alcool",JOptionPane.QUESTION_MESSAGE));
			resultado = (km/litrosporKm);
			resultado = resultado*alcool;
			litros = resultado/alcool;
			
			JOptionPane.showMessageDialog(null," O veiculo gastara RS"+resultado+"\n km: "+km+" km \n Litros: "+litros+" litros", "Resultado Alcool", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(combustivel == options[1]){
			gasolina = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da gasolina","Gasolina",JOptionPane.QUESTION_MESSAGE));
			litrosporKm = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km por litro?","Gasolina",JOptionPane.QUESTION_MESSAGE));
			resultado = (km/litrosporKm);
			resultado = resultado*gasolina;
			litros = resultado/gasolina;
			
			JOptionPane.showMessageDialog(null," O veiculo gastara RS"+resultado+"\n km: "+km+" km \n litros: "+litros+" litros", "Resultado Gasolina", JOptionPane.INFORMATION_MESSAGE);
			
	}

}
	
}
