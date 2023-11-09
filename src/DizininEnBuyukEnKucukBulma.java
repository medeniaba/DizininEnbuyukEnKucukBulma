import java.util.Scanner;

// Kullanıcıdan aldığı 10 adet int veriyi diziye ekleyip içinden en büyük ve en küçük olanı bulan uygulama 

public class DizininEnBuyukEnKucukBulma {
	

	public static void main (String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		int dizi [] = new int [10] ;
		
		System.out.println("lütfen 10 tane tam sayı degeri giriniz ");
		for ( int i = 0 ; i<dizi.length ; i ++ )
		{
		  
		  dizi[i] = klavye.nextInt() ; 
	
		}
		
		int enbuyuk = dizi[0];
		int enkucuk = dizi[0];
		for( int i = 0 ;i < dizi.length ; i++ ) {
			if (   dizi[i] > enbuyuk) {
				enbuyuk = dizi[i];
		
			if ( dizi[i]< enkucuk )
				enkucuk = dizi[i];
				
			
			
		}
	
	 
	   
	   
		
	}  
		
	 System.out.println("En büyük = " + enbuyuk + " en Kücük =  " + enkucuk );
	
	}

}
