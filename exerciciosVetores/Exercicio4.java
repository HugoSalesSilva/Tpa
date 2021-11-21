import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int r, i, j;
		int[] a = new int[10];
		
		System.out.println("Coloque os valores:");
		
		for(i=1;i<10;i++) {
			r=2;
			
			for(j=1;j<i;j++) {
				r=2*r;
			}
			a[i]=r;
		}

		//apresentação do vetor A
		System.out.println("Valores:");
		for(i=0;i<10;i++) {
			System.out.println(a[i]);
		}
	}

}
