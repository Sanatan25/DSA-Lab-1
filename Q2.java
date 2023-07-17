import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		double h = sc.nextDouble();
		System.out.println("Enter the weight");
		double w = sc.nextDouble();
		
		double bmi = w/Math.pow(h, 2);
		
		if(bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi >= 25.0 && bmi <= 29.9) {
			System.out.println("over weight");
		}
		else if(bmi >= 30.0) {
			System.out.println("obese");
		}
		else {
			System.out.println("error");
		}

	}

}
