import java.util.Scanner;
public class Question3{
	public static void main(String[] args) {
	int number;
	 System.out.println("Enter the any Integer number: ");
	 Scanner obj = new Scanner(System.in);
	 number = obj.nextInt();
	 if (number<=10) {
	 	System.out.print("less then to ten ");
	 }else if (number >= 10 && number <= 20) {
	 	System.out.print("greater then ten and less then twenty");
	 }else{
	 	System.out.print("greater then twenty");
	 }

	}
}