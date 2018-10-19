import java.util.Scanner;
public class IfElse3{
	public static void main(String[] args) {
		int first, second; 
		System.out.println("It will be do print big Number: ");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		first = obj.nextInt();
		System.out.println("Enter the second Number: ");
		second = obj.nextInt();
		if ( first<second) {
			System.out.print(second);
		}else{
			System.out.print(first);
		}
	}
}