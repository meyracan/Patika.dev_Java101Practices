package d�ng�ler;
import java.util.Scanner;
public class ATMProjesi {

	
	public static void main(String[] args) {
		
		System.out.println("ATM'ye ho�geldiniz!");
		int balance= 1500;
		int counter= 3;
		
		while(counter>0) {
		System.out.print("L�rfen kullan�c� ad�n�z� giriniz: ");
		Scanner input = new Scanner(System.in);
		String userName= input.nextLine();
		System.out.print("L�rfen parolan�z� giriniz: ");
		int password=input.nextInt();
		int choice;
		
		if(userName.equals("Meyra") && password==1234) {
			System.out.println("Kullan�c� ad� ve �ifre do�ru! L�tfen yapmak istedi�iniz i�lemi se�iniz:\n"
					+ "1- Bakiye Sorgula\n"
					+ "2- Para Yat�rma\n"
					+ "3- Para �ekme\n"
					+ "4- ��k�� Yap ");
			counter=3;
			do {
				choice=input.nextInt();
				switch(choice) {
				case 1: 
					System.out.println("Bakiyeniz: "+ balance);
					break;
				case 2: 
					System.out.println("Yat�r�lacak para miktar�n�z giriniz: ");
					int yatirilacak = input.nextInt();
					balance += yatirilacak;
					System.out.println("Yeni bakiyeniz: "+ balance);
					break;
				case 3:
					System.out.println("�ekilecek para miktar�n�z giriniz: ");
					int cekilecek = input.nextInt();
					balance -= cekilecek;
					System.out.println("Yeni bakiyeniz: "+ balance);
					break;
				case 4:
					System.out.println("��k�� Yap�ld�");
					break;
				default:
					System.out.println("L�tfen ge�erli bir se�im yap�n!");
					break;
				}
				
			}while(choice!=4);
		
			 }
	
		else
			System.out.println("Kullan�c� ad� ve parola yanl��!");
			counter--;
			if(counter==0) {
				System.out.println("Hesab�n�z bloke oldu!");
			}
	}	
	}

}
