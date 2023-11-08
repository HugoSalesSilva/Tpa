import java.io.ObjectInputStream;

import javax.swing.*;
public class Exercicio1 {
	
	public static void main(String[] args) {
		String moeda;
		double real,resultado, dolar, euro;
		
		
		Object[] options = {"Dolar","Euro"};
		
		moeda = (String) JOptionPane.showInputDialog(null, "Selecione a Moeda desejada", "Conversão", JOptionPane.QUESTION_MESSAGE,null,options, options[0]);
		real = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto você quer converter ?","Real",JOptionPane.QUESTION_MESSAGE));
		if(moeda == options[0] ){
			dolar = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a cotação atual","Dolar",JOptionPane.QUESTION_MESSAGE));
		
			resultado = (real/dolar);
			resultado=(int)(resultado*100);
			resultado=resultado/100;
			JOptionPane.showMessageDialog(null,"Valor em dolar:"+resultado+"$", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(moeda == options[1]){
			euro = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a cotação atual","Euro",JOptionPane.QUESTION_MESSAGE));
			
			resultado = (real/euro);
			resultado=(int)(resultado*100);
			resultado=resultado/100;
			JOptionPane.showMessageDialog(null,"Valor em Euro:"+resultado+"$", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
	
}


