public class NagPos{
	public static void main(String[] args) {
		// int a;
		int num;
		for (num = 1;num<=100 ;num++) {
			if (num%2!=0) {
				System.out.println(-num);
			}else{
				System.out.println(num);
			}
		}
	}
}