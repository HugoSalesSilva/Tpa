import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] ,n, i;
		
		final int TAM = 10;
		
		a = new int[TAM];
		
		System.out.println("Coloque os números:");
		for(i=0;i<TAM;i++) {
			a[i]=ler.nextInt();
		}
		
		System.out.println("Coloque o elemento X:");
		n=ler.nextInt();
		
		for(i=0;i<TAM;i++) {
			if(a[i]==n) {
				System.out.println("O elemento X de valor "+n+" está em A na "+(i+1)+" posição.");
			}
		}
		
	}

}
