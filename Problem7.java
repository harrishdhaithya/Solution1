
public class Problem7 {
	public static int convtoInt(char ch) {
		switch(ch) {
			case 'I':return 1;
			case 'V':return 5;
			case 'X':return 10;
			case 'L':return 50;
			case 'C':return 100;
			case 'D':return 500;
			case 'M':return 1000;
			default:return -1;
		}
	}
	public static void main(String[] args) {
		String roman = "IV";
		int n= roman.length();
		int intval=0;
		for(int i=0;i<n;i++) {
			char c1 = roman.charAt(i);
			int val1 = convtoInt(c1);
			if(i+1<n) {
				char c2 = roman.charAt(i+1);
				int val2 = convtoInt(c2);
				if(val2>val1) {
					intval = intval+val2-val1;
					i+=1;
					continue;
				}
			}
			intval+=val1;
		}
		System.out.println(intval);
	}

}
