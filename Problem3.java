
public class Problem3 {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,4,7};
		int n=6;
		int target = 10;
		int n1=-1,n2=-1,n3=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						n1=arr[i];
						n2=arr[j];
						n3=arr[k];
						break;
					}
				}
			}
		}
		System.out.println("The Triplet is "+"("+n1+","+n2+","+n3+")");
	}

}
