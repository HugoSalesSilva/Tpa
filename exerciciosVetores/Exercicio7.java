import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		
		int a[], b[], c[], i, j, k=0;
		boolean encontrado;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		System.out.println("Vetor A:");
		for(i=0;i<TAM;i++) {
			a[i]=ler.nextInt();
		}
		
		System.out.println("Vetor B:");
		for(i=0;i<TAM;i++) {
			b[i]=ler.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			
			encontrado=true;
			
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					encontrado=false;
				}
			}
			if(encontrado==false) {
				c[k]=a[i];
				k++;
			}
			
		}
		
		System.out.println("Vetor C:");
		System.out.print("[] ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+", ");
		}
		System.out.print("[]");
	}

}