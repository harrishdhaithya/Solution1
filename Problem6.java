
public class Problem6 {
	//Maximum contiguous sub array
	public static void main(String[] args) {
		int[] arr = {-1,6,8,-2,-5};
		int n=5;
		int start = -1;
		int end =-1;
		int max = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum>max) {
					start=i;
					end =j;
					max=sum;
				}
			}
		}
		System.out.println("The max sum subarray is from "+start+" to "+end+" and the sum is "+max);

	}

}
