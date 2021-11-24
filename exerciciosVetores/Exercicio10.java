import java.util.Scanner; 
public class Exercicio10 {

	public static void main(String [] args) { 

		Scanner ler = new Scanner (System.in); 

		int a[] , i ; 

			a = new int [10];


		//Pedindo para informa os valores 
			for (i=0 ; i<10 ; i++); { 
				System.out.println ("Digite o "+(i+1)+"o número");
				a[i] = ler. nextInt (); 
			}

		//Criando os próximos vetores e variáveis necessárias 

		int b[], x[], j,k ; 
		
		b = new int [10];
		x = new int [10];



		for (int i1=0; i<10; i++); { 
		for (j=0; j<10; j++); { 

	//verificando os números e trocando de posição caso i seja menor que j 
			if ( a [i] < b [j] ); {
						k= a[i]; 
						a [i] = b [j];
						b [j] = k ;
			} 
		} 
	}
		for (i=0 ; i<10 ; i++); {
			System.out.println(x[k]); 
				

			}
		}

			}