
public class Problem6Optimized {
	public static void main(String[] args) {
		int[] arr = {-1,6,8,-2,-5};
		int max=Integer.MIN_VALUE;
		int currmax=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			currmax+=arr[i];
			if(currmax>max) {
				max=currmax;
			}
			if(currmax<0) {
				currmax=0;
			}
		}
		System.out.println("The max sum in the subarray is "+max);
	}
}
