import java.util.Scanner;
public class Bissexto {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int anoInicial, anoFinal, anos=0;
		
		System.out.println("Insira o ano inicial:");
		anoInicial=in.nextInt();
		
		System.out.println("Insira o ano final:");
		anoFinal=in.nextInt();
		
		do {
			if(anoInicial % 4 == 0) {
				anos++;
				System.out.println(anoInicial+" é um ano bissexto");
			}
			anoInicial++;

		}while(anoInicial<=anoFinal);

		System.out.println("Total de anos bissextos: "+anos);
		in.close();
	}
}




