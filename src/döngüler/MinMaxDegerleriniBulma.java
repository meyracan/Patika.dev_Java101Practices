package döngüler;

import java.util.Scanner;

public class MinMaxDegerleriniBulma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç adet sayý gireceðinizi giriniz: ");
		int numberCount= input.nextInt();
		int max=0;int number=0;int min=0;
		for(int i =1; i<=numberCount; i++) {
			System.out.print(i+". sayýyý giriniz: ");
			number = input.nextInt();
			if(i==1) {
				min=number;
				max=number;
			}
			if(number>max) {
				max=number;	
			}
			if(number<min){
				min=number;
			}
			
		}
		
		System.out.println("En büyük sayý: "+ max);
		System.out.println("En küçük sayý: "+min);
		
		

	}

}
