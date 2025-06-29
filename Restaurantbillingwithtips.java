package zoho;
import java.util.Scanner;
public class Restaurantbillingwithtips {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base bill Amount :");
		double Basebill = sc.nextDouble();
		System.out.println("Enter service rating (good/average/poor) :");
		String Rating = sc.next().toLowerCase();
		double tip = 0;
		if(Rating.equals("good")) {
			tip = 0.20 * Basebill;
			}
		else if(Rating.equals("average")) {
			tip = 0.10 * Basebill;
		}
		else if(Rating.equals("poor")) {
			tip = 0.05 * Basebill;
		}
		else {
			System.out.println("Invalid Rating");
		
		sc.close();
		return;
		
		
				
	}
	double finalAmount = Basebill + tip;
	System.out.println("FinalAmount : " + (int)finalAmount);
	sc.close();
	}
	
	
	
	

}
