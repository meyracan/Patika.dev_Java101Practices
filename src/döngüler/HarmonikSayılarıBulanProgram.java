package d�ng�ler;
import java.util.Scanner;
public class HarmonikSay�lar�BulanProgram {

	public static void main(String[] args) {
		System.out.print("n say�s�n� giriniz:");
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
