public class Multiplo10 {
	public static void main(String[] args) {
		int i=1;
		
		do{
			if(i % 10 == 0) {
				System.out.println(i+" - Múltiplo de 10");
			}else{
				System.out.println(i);
			}

			i++;
		}while(i<=300);
	}
}



