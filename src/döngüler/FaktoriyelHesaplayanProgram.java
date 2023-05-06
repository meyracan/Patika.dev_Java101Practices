package döngüler;
import java.util.Scanner;
public class FaktoriyelHesaplayanProgram {

	//Ödev: Java ile kombinasyon hesaplayan program yazýnýz:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kombinasyonu alýnacak 2 sayýyý sýrayla giriniz C(n,r): ");
		int n =  input.nextInt();
		int r= input.nextInt();
		int i, nFaktoriyel=1, rFaktoriyel=1, nEksirFaktoriyel=1;
		for(i=n; i>0;i--) {
			nFaktoriyel= i*nFaktoriyel;
		}
		for(i=r; i>0;i--) {
			rFaktoriyel= i*rFaktoriyel;
		}
		for(i=n-r; i>0;i--) {
			nEksirFaktoriyel= i*nEksirFaktoriyel;
		}
		
		System.out.println(nFaktoriyel / (rFaktoriyel*nEksirFaktoriyel) );
		
		
		
		
		

	}

}
