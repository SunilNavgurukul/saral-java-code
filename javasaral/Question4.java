import java.util.Scanner;
public class Question4{
	public static void main(String[] args) {
		int number = 44*30;
		int user_input;
		System.out.println("Enter the any number: ");
		Scanner obj = new Scanner(System.in);
		user_input = obj.nextInt();
		if (user_input >= number) {
			System.out.print("bada hai ya baraber hai: ");
		}else{
			System.out.print("Chota hai: ");
		}
	}
}