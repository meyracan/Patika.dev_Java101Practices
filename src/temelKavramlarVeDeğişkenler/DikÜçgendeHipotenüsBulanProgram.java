package temelKavramlarVeDeðiþkenler;
import java.util.Scanner;
public class DikÜçgendeHipotenüsBulanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk dik kenarý giriniz: ");
		int kenar1 = input.nextInt();
		System.out.print("Ýkinci dik kenarý giriniz: ");
		int kenar2 = input.nextInt();
		
		double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
		
		System.out.println("Hipotenüs: " + hipotenus);
		
		double ucgeninCevresi= kenar1 + kenar2 + hipotenus;
		double ucgeninCevresininYarisi = ucgeninCevresi/2;
	
		double alan = Math.sqrt(ucgeninCevresininYarisi*(ucgeninCevresininYarisi-kenar1)*(ucgeninCevresininYarisi-kenar2)*
				(ucgeninCevresininYarisi-hipotenus));
		
		System.out.println("Alan: " + alan);
		
		
	}

}
