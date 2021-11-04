import java.util.Scanner;
public class Altura {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int alturaJ, alturaP, cmJ, cmP;
		System.out.println("Entre com a altura do João");
		alturaJ = Ler.nextInt();
		System.out.println("Entre com a altura do Pedro");
		alturaP = Ler.nextInt();
		cmJ = Ler.nextInt();
		cmP = Ler.nextInt();
		alturaJ = cmJ + alturaJ;
		alturaP = cmP + alturaP;
		id (alturaJ < alturaP) {
			System.out.println("Apresentar Resposta")
		
			Ler.close()
		}
	}

}
