
public class Problem4 {

	public static void main(String[] args) {
		int[] prices = {5,7,3,9,12};
		int n=5;
		int max = 0,buy=-1,sell=-1;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int profit = prices[j]-prices[i];
				if(profit>max) {
					max=profit;
					buy=i;
					sell=j;
				}
			}
		}
		System.out.println("["+buy+","+sell+"]");
	}

}
