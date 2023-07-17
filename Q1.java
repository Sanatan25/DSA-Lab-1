import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the number");
		int n = sc.nextInt();
		int count = 0;
		
		while(n >2) {
			n = n/2;
			count++;
		}
		System.out.println(count);

	}

}
