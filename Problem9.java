public class Problem8 {
	public static int addArr(int[] arr,int start,int end) {
		int sum = 0;
		for(int i=start;i<end;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {
				1,2,3,6
		};
		int mid=-1;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int sumLeft = addArr(arr,0,i+1);
			int sumRight = addArr(arr,i+1,n);
			if(sumLeft==sumRight) {
				mid=i;
				break;
			}
		}
		if(mid==-1) {
			System.out.println("No such subarrays");
		}else {
			System.out.println("The subarray 0 to "+ mid+" and "+(mid+1)+" to "+n+" are equal...");
		}
	}
}
