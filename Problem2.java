
public class Problem2 {

	public static void main(String[] args) {
		int[] arr = {1,5,5,5,7,7,7,10};
		int n=8;
		int start = -1;
		int end = -1;
		int target = 7;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				start=i;
				break;
			}
		}
		for(int j=start;j<n;j++) {
			if(arr[j]==target) {
				end=j;
			}else {
				break;
			}
		}
		System.out.println("["+start+","+end+"]");

	}

}
