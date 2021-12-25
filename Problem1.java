import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		int[] arr = {2,5,3,7,9};
		int n=5;
		int start = -1;
		int end = -1;
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int height = Math.min(arr[i], arr[j]);
				int width = j-i;
				int capacity = height*width;
				if(capacity>max) {
					max=capacity;
					start=i;
					end=j;
				}
			}
		}
		System.out.println("["+start+","+end+"]");
	}

}
