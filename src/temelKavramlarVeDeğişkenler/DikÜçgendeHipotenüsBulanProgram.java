package temelKavramlarVeDe�i�kenler;
import java.util.Scanner;
public class Dik��gendeHipoten�sBulanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�lk dik kenar� giriniz: ");
		int kenar1 = input.nextInt();
		System.out.print("�kinci dik kenar� giriniz: ");
		int kenar2 = input.nextInt();
		
		double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
		
		System.out.println("Hipoten�s: " + hipotenus);
		
		double ucgeninCevresi= kenar1 + kenar2 + hipotenus;
		double ucgeninCevresininYarisi = ucgeninCevresi/2;
	
		double alan = Math.sqrt(ucgeninCevresininYarisi*(ucgeninCevresininYarisi-kenar1)*(ucgeninCevresininYarisi-kenar2)*
				(ucgeninCevresininYarisi-hipotenus));
		
		System.out.println("Alan: " + alan);
		
		
	}

}
