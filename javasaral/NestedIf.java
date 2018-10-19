import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		int input;
		System.out.print("Enter any number: ");
		Scanner obj = new Scanner(System.in);
		input = obj.nextInt();
		if (input%5==0) {
			if (input%15==0) {
				System.out.print("It is divisible by both 5 and 15:) ");
			}else{
				System.out.print("Only divisible by 5");
			}
		}else{
			System.out.println("Not divisible by any think else:'(");
		}
	}
}