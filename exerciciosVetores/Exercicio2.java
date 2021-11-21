import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], r, i, j;
		
		a = new int[5];
		
		System.out.println("Coloque o valor do vetor A:");
		for(i=0;i<5;i++) {
			a[i]=ler.nextInt();
		}
		
		for(i=0;i<5;i++) {
			for(j=1;j<=10;j++) {
				r=a[i]*j;
				System.out.println(a[i]+" x "+j+" = "+r);
			}
			System.out.println();
		}
		
	}
}
