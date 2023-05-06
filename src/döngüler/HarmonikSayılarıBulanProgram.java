package döngüler;
import java.util.Scanner;
public class HarmonikSayýlarýBulanProgram {

	public static void main(String[] args) {
		System.out.print("n sayýsýný giriniz:");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int i=1; double sum=0;
		
		while(i<=sayi) {
			sum = sum + (1.0/i);
			i++;
			System.out.println(i);
			System.out.println(sum);
		}
		
		System.out.println(sum);
		
		

	}

}
