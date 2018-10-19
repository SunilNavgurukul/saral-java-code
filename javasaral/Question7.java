import java.util.Scanner;
public class Question7{
	public static void main(String[] args) {
		int number;
		System.out.println("Enter the any Number");
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();
		if (number<0) {
			System.out.println("Nagitive Number:");
		}else if (number>0) {
			System.out.println("Positive Number:");
		}else{
			System.out.println("it is 0");
		}
	}
}