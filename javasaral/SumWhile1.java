public class SumWhile1{
	public static void main(String[] args) {
		int num;
		int eight=0;
		for (num=30;num<=420 ;num=num+1) {
			if (num%8==0) {
				eight = eight + num;
			}
		}
		System.out.println(eight);
	}
}