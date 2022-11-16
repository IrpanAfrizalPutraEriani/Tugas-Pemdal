import java.util.Scanner;

public class mencariluasdankelilinglapanganbulutangkis{
	public static void main(String[] args){
		int panjang, lebar, jumlahpanjanglapangan, jumlahlebarlapangan, luaslapangan, kelilinglapangan;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("PROGRAM MENGHITUNG LUAS DAN KELILING LAPANGAN BULU TANGKIS");
		System.out.println("==========================================================");
		
		System.out.println("Masukan Panjang Lapangan : ");
		jumlahpanjanglapangan= scan.nextInt();
		System.out.println("Masukan lebar lapangan : ");
		jumlahlebarlapangan= scan.nextInt();
		
		luaslapangan = jumlahpanjanglapangan*jumlahlebarlapangan;
		kelilinglapangan = jumlahpanjanglapangan*2+jumlahlebarlapangan*2;
		
		System.out.println("LUAS LAPANGAN BULU TANGKIS :" + luaslapangan);
		System.out.println("KELILING LAPANGAN BULU TANGKIS :" + kelilinglapangan);
		System.out.println(" (! !) ");
		System.out.println(" ('.')");
		System.out.println(" ( > IRPAN  ");
	
		
	}
}