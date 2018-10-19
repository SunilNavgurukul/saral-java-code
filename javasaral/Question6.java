import java.util.Scanner;
public class Question6{
	public static void main(String[] args) {
		int age;
		System.out.println("Please enter your Age: ");
		Scanner obj = new Scanner(System.in);
		age = obj.nextInt();
		if (age >= 5) {
			System.out.println("5 saal ki umar ke baad school ja skte ho");
		}if (age >= 18) {
			System.out.println("18 saal ki umar ke baad vote de skte ho");
		}if (age >=21) {
			System.out.println("21 saal ki umar ke baad car drive kar skte ho");
		}if (age >= 24) {
			System.out.println("24 ki umar ke baad Shaadi kar skte ho:");
		}if (age >= 25){
			System.out.println("25 ki umar ke baad legally drink kar skte ho");
		}
	}
}