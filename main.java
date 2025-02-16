import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double weeklyIncome;
		double taxRate;
		double taxWithholding;

		System.out.print("Enter your weekly income: $");
		weeklyIncome = in.nextDouble();
		
		if (weeklyIncome < 500) {
			taxRate = .1;
			taxWithholding = weeklyIncome * taxRate;
			System.out.println("Tax Rate: 10%");
			System.out.println("Tax Withholding: $" + taxWithholding);			
		}
		else if (weeklyIncome >= 500 & weeklyIncome < 1500) {
			taxRate = .15;
			taxWithholding = weeklyIncome * taxRate;
			System.out.println("Tax Rate: 15%");
			System.out.println("Tax Withholding: $" + taxWithholding);			
		}
		else if (weeklyIncome >= 1500 & weeklyIncome < 2500) {
			taxRate = .2;
			taxWithholding = weeklyIncome * taxRate;
			System.out.println("Tax Rate: 20%");
			System.out.println("Tax Withholding: $" + taxWithholding);			
		}
		else {
			taxRate = .3;
			taxWithholding = weeklyIncome * taxRate;
			System.out.println("Tax Rate: 30%");
			System.out.println("Tax Withholding: $" + taxWithholding);			
		}
	}

}
