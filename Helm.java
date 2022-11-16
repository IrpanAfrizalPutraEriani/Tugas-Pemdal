import java.util.Scanner;

public class jumlahbelanja{
	public static void main(String[] args){
		int Helm, Visor, Spoiler, jumlahhelm, jumlahvisor, jumlahspoiler, totalbelanja;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("PROGRAM MENGHITUNG JUMLAH TOTAL BELANJA");
		System.out.println("=======================================");
		
		System.out.println("Masukan jumlah Helm : ");
		jumlahhelm= scan.nextInt();
		System.out.println("Masukan jumlah Visor : ");
		jumlahvisor= scan.nextInt();
		System.out.println("Masukan jumlah Spoiler : ");
		jumlahspoiler= scan.nextInt();
		
		Helm = 7499000*jumlahhelm;
		Visor = 449000*jumlahvisor;
		Spoiler = 149000*jumlahspoiler;
		totalbelanja = Helm+Visor+Spoiler;
		
		System.out.println("Total Belanja :" + totalbelanja);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}
}