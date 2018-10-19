import java.util.Scanner;
public class AverageWeight{
	public static void main(String[] args) {
		int weight;
		int index=1;
		int sum=0;
		Scanner obj = new Scanner(System.in);
		for (index=1;index<=11 ;index=index+1 ) {
			System.out.println("Enter your weight:");
			weight = obj.nextInt();
			sum=sum+weight;
		}
		System.out.println(sum/index);
	}
}