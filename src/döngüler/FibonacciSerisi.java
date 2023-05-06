package döngüler;

import java.util.Scanner;
public class FibonacciSerisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci Dizisinin Eleman Sayýsýný Girin: ");
		int elemanSayisi=input.nextInt();
		int sum=0;
		int sayi1=0, sayi2=1;
		
		System.out.print(sayi1+" ");
		
		for(int i=1; i<=elemanSayisi; i++) {
			System.out.print(sayi2 + " ");
			sum=sayi1+sayi2;
			sayi1=sayi2;
			sayi2=sum;
		
			
		}
	
	}

}
