package döngüler;
import java.util.Scanner;
public class ATMProjesi {

	
	public static void main(String[] args) {
		
		System.out.println("ATM'ye hoþgeldiniz!");
		int balance= 1500;
		int counter= 3;
		
		while(counter>0) {
		System.out.print("Lürfen kullanýcý adýnýzý giriniz: ");
		Scanner input = new Scanner(System.in);
		String userName= input.nextLine();
		System.out.print("Lürfen parolanýzý giriniz: ");
		int password=input.nextInt();
		int choice;
		
		if(userName.equals("Meyra") && password==1234) {
			System.out.println("Kullanýcý adý ve þifre doðru! Lütfen yapmak istediðiniz iþlemi seçiniz:\n"
					+ "1- Bakiye Sorgula\n"
					+ "2- Para Yatýrma\n"
					+ "3- Para Çekme\n"
					+ "4- Çýkýþ Yap ");
			counter=3;
			do {
				choice=input.nextInt();
				switch(choice) {
				case 1: 
					System.out.println("Bakiyeniz: "+ balance);
					break;
				case 2: 
					System.out.println("Yatýrýlacak para miktarýnýz giriniz: ");
					int yatirilacak = input.nextInt();
					balance += yatirilacak;
					System.out.println("Yeni bakiyeniz: "+ balance);
					break;
				case 3:
					System.out.println("Çekilecek para miktarýnýz giriniz: ");
					int cekilecek = input.nextInt();
					balance -= cekilecek;
					System.out.println("Yeni bakiyeniz: "+ balance);
					break;
				case 4:
					System.out.println("Çýkýþ Yapýldý");
					break;
				default:
					System.out.println("Lütfen geçerli bir seçim yapýn!");
					break;
				}
				
			}while(choice!=4);
		
			 }
	
		else
			System.out.println("Kullanýcý adý ve parola yanlýþ!");
			counter--;
			if(counter==0) {
				System.out.println("Hesabýnýz bloke oldu!");
			}
	}	
	}

}
