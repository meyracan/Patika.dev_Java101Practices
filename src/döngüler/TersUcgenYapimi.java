package d�ng�ler;

import java.util.Scanner;
public class TersUcgenYapimi {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Basamak say�s�n� giriniz: ");
		int basamakSayisi= input.nextInt();
		
		
		for(int k=1; k<=(basamakSayisi*2)-1; k=k+2) {
			for(int i=k; i<=(basamakSayisi*2)-1; i++) {
			
				System.out.print("*");	
			}
			
			System.out.println();	
		
			for(int m=1; m<=k; m=m+2)	{
				System.out.print(" ");	
			}
				
		}
		
		
		
	}

}
