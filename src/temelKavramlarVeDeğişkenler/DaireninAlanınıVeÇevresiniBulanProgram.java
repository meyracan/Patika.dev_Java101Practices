package temelKavramlarVeDe�i�kenler;
import java.util.Scanner;
public class DaireninAlan�n�Ve�evresiniBulanProgram {

	public static void main(String[] args) {
		double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		double yariCap = input.nextDouble();
		
		double alan = PI * (Math.pow(yariCap, 2)) ;
		
		double cevre = 2 * PI * yariCap;
		
		System.out.println("Alan: " + alan + "," + "�evre: " + cevre);
		
		System.out.println("Dairenin merkez a��s�n�n �l��s�n� giriniz: ");
		double merkezAci = input.nextDouble();
		
		double merkezAciliAlan = (PI * merkezAci * (Math.pow(yariCap, 2))) / 360;
		
		System.out.println("Merkez A��l� Daire Diliminin Alan�: " + merkezAciliAlan);
		
	}

}
