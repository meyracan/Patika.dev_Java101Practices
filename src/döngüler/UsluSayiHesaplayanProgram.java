package d�ng�ler;
import java.util.Scanner;
public class UsluSayiHesaplayanProgram {

	//�dev: Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� "For D�ng�s�" kullanarak yap�n�z:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ss� al�nacak say�: ");
		int number = input.nextInt();
		System.out.print("�s olan say�: ");
		int power = input.nextInt();
		int total =1;
		for(int i=1; i<=power; i++) {
			total= total*number;
		}
		System.out.println(total);
		
		
		

	}

}
