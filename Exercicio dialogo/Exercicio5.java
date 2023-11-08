
import javax.swing.*;
public class Exercicio5 {
	public static void main(String[] args) {
		String gasolina;
		double resultado, km,litrosporKm,resultado2,litros;
		
		
		Object[] options = {"Alcool","Gasolina"};
		
		gasolina = (String) JOptionPane.showInputDialog(null, "Selecione a tipo de combustivel desejada", "Combustivel", JOptionPane.QUESTION_MESSAGE,null,options, options[0]);

		if(gasolina == options[0] ){
			km = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km?","Alcool",JOptionPane.QUESTION_MESSAGE));
			litrosporKm = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km por litro?","Alcool",JOptionPane.QUESTION_MESSAGE));
			resultado = (km/litrosporKm);
			resultado = resultado*3.50;
			litros = resultado/3.50;
			
			JOptionPane.showMessageDialog(null,"O veiculo gastara RS"+resultado+" para andar "+km+" km e gatara "+litros+" litros", "Resultado Alcool", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(gasolina == options[1]){
			km = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km?","Gasolina",JOptionPane.QUESTION_MESSAGE));
			litrosporKm = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos km por litro?","Gasolina",JOptionPane.QUESTION_MESSAGE));
			resultado = (km/litrosporKm);
			resultado = resultado*5.00;
			litros = resultado/5.00;
			
			JOptionPane.showMessageDialog(null,"O veiculo gastara RS"+resultado+" para andar "+km+" km e gatara "+litros+" litros", "Resultado Gasolina", JOptionPane.INFORMATION_MESSAGE);
			
	}

}
	
}
