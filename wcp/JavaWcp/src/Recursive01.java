
public class Recursive01 {
	public static void main(String[] args) {
		int n = 1;
		printNum(n);
	}
	
	public static int printNum(int n) {
		if (n < 50) {
			n *= 2;
			System.out.println("n = " + n);
			printNum(n);
		}
		return n;
	}
}
