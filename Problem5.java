
public class Problem5 {
	public static int sumofSquareN(int n) {
		int sum =0;
		while(n!=0) {
			int r=n%10;
			sum+=r*r;
			n/=10;
		}
//		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		int n = 23;
		while((int)n/10!=0) {
			n=sumofSquareN(n);
		}
		if(n==1) {
			System.out.println("N is a Happy Number");
		}else {
			System.out.println("N is not a Happy Number");
		}

	}

}
