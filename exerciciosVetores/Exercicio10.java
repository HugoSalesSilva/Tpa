import java.util.Scanner; 
public class Exercicio10 {

	public static void main(String [] args) { 

		Scanner ler = new Scanner (System.in); 

		int a[], b[] , i, j, k; 

		a = new int [10];
		b = new int [10];

		//Pedindo para informa os valores 
		for (i=0 ; i<10 ; i++){
			System.out.println ("Digite o "+(i+1)+"o número");
			a[i] = ler. nextInt ();
			b[i]=a[i];
		}

		for (i=0; i<10; i++){ 
			for (j=0; j<10; j++){ 	
				//verificando os números e trocando de posição caso i seja menor que j 
				if ( b [i] < b [j] ){
					k= b[i]; 
					b [i] = b [j];
					b [j] = k ;
				} 
			} 
		}
		System.out.println("Vetor misturado:");
		System.out.print("[");
		for(i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]\n");
		System.out.println("Vetor em ordem crescente:");
		System.out.print("[");
		for (i=0 ; i<10 ; i++){
			System.out.print(b[i]+" "); 
		}
		System.out.println("]");

	}

}