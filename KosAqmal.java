import java.util.Scanner;

public class mencarivolumeluasdankelilingbangunankosAqmal{
	public static void main(String[] args){
		int panjang, lebar, tinggi, jumlahtinggibangunan, jumlahlebarbangunan, luasbangunan, kelilingbangunan, volumebangunan, jumlahpanjangbangunan;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("PROGRAM MENGHITUNG LUAS, KELILING DAN VOLUME BANGUNAN KOS AQMAL");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Masukan Panjang bangunan : ");
		jumlahpanjangbangunan= scan.nextInt();
		System.out.println("Masukan lebar bangunan : ");
		jumlahlebarbangunan= scan.nextInt();
		System.out.println("Masukan tinggi bangunan : ");
		jumlahtinggibangunan= scan.nextInt();
		
		luasbangunan = (jumlahpanjangbangunan*jumlahlebarbangunan+jumlahtinggibangunan*jumlahlebarbangunan+jumlahpanjangbangunan*jumlahtinggibangunan)*2;
		kelilingbangunan = (jumlahpanjangbangunan+jumlahlebarbangunan+jumlahtinggibangunan)*4;
		volumebangunan = jumlahpanjangbangunan*jumlahlebarbangunan*jumlahtinggibangunan;
		System.out.println("LUAS BANGUNAN KOS AQMAL :" + luasbangunan);
		System.out.println("KELILING BANGUNAN KOS AQMAL :" + kelilingbangunan);
		System.out.println("VOLUME BANGUNAN KOS AQMAL :" + volumebangunan);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(" (! !) ");
		System.out.println(" ('.')");
		System.out.println(" ( > IRPAN  ");
	}
}