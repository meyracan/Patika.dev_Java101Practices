package temelKavramlarVeDeðiþkenler;
import java.util.Scanner;
public class DaireninAlanýnýVeÇevresiniBulanProgram {

	public static void main(String[] args) {
		double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yarýçapýný giriniz: ");
		double yariCap = input.nextDouble();
		
		double alan = PI * (Math.pow(yariCap, 2)) ;
		
		double cevre = 2 * PI * yariCap;
		
		System.out.println("Alan: " + alan + "," + "Çevre: " + cevre);
		
		System.out.println("Dairenin merkez açýsýnýn ölçüsünü giriniz: ");
		double merkezAci = input.nextDouble();
		
		double merkezAciliAlan = (PI * merkezAci * (Math.pow(yariCap, 2))) / 360;
		
		System.out.println("Merkez Açýlý Daire Diliminin Alaný: " + merkezAciliAlan);
		
	}

}
