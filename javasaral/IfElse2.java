import java.util.Scanner;
public class IfElse2{
	public static void main(String[] args) {
		int varx, vary;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		varx = obj.nextInt();
		System.out.print("Enter the Second number: ");
		vary = obj.nextInt();
		if (varx%vary==0) {
			System.out.print("Divisible hai");
		}else{
			System.out.print("Divisible nhi hai");
		}
	}
}