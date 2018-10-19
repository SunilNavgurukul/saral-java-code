import java.util.Scanner;
public class Question2{
	public static void main(String[] args) {
		String name;
		System.out.println("Enter your name:) ");
		Scanner obj = new Scanner(System.in);
		name = obj.nextLine();
		int length = name.length();
		if (length >= 5){
			System.out.print("Your name is lenghthy:)");
		}else{
			System.out.print("Not lenghthy");
		}
	}
}