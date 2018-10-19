import java.util.Scanner;
public class Question5{
	public static void main(String[] args) {
		int water;
		System.out.println("How many water you have :) ");
		Scanner obj = new Scanner(System.in);
		water = obj.nextInt();
		if (water%2==0) {
			if (water%4==0) {
				System.out.println("2 or 4 se Divisible hai :");
			}else{
				System.out.println("Bus 2 se Divisible hai...");
			}
		}
		else{
			System.out.println("Not Divisible to anythink:");
		}
	}
}