import java.util.Scanner;
public class VerificaIdade {
	public static void main(String args[]) {
		Scanner Ler = new Scanner(System.in);
		int aa, an, id;
		System.out.println("Entre com o ano do seu nascimento");
		an = Ler.nextInt();
		System.out.println("Entre com o ano atual");
		aa = Ler.nextInt();
		id = aa-an;
		System.out.println("Sua idade é"+id+" anos");
		if (id<10) {
			System.out.println("Criança");
		}if (id>10 <18) {
			System.out.println("adolescente");
		}if (id>18 <60) {
			System.out.println("Adulto");
		}if (id>60) {
			System.out.println("idoso");
		}
		Ler.close()
}