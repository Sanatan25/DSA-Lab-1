import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int product = 1;
		
		
		while(n >0) {
			int digit = n%10;
			sum+=digit;
			product*=digit;
			n/=10;
		}
		if(sum == product) {
			System.out.println("Spy");
		}
		else {
			System.out.println("not");
		}

	}

}
