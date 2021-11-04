import java.util.Scanner;
public class MaiorNumero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, valor, nMaior;
		
		System.out.println("Insira o número de valores que deseja inserir:");
		n=in.nextInt();
		
		if(n>0) {

			System.out.println("Entre com um número:");
			valor=in.nextInt();
			nMaior=valor;
			n--;

			do {
				System.out.println("Entre com um número:");
				valor=in.nextInt();
				if(valor>nMaior) {
					nMaior=valor;
				}

				n--;

				if(n==0) {
					System.out.println("O maior número é: "+nMaior);
					System.out.println("Insira o número de valores que deseja inserir:");
					n=in.nextInt();
					if(n>0) {
						System.out.println("Insira um número:");
						valor=in.nextInt();
						nMaior=valor;
						n--;
					}
				}

			}while(n>0);
		}
		in.close();
		
	}
}