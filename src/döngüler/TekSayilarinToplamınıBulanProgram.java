package d�ng�ler;
import java.util.Scanner;
public class TekSayilarinToplam�n�BulanProgram {

	//�dev: Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve 
	//girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, sum=0;
		do {
			System.out.print("Say�y� giriniz: ");
			number = input.nextInt();
			if(number%2==0 || number%4==0)
				sum+=number;
			
		}while(number%2==0);
		
		System.out.println("Toplam: " + sum);
		

	}

}
