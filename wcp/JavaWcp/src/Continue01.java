
public class Continue01 {
	public static void main(String[] args) {
		for (int c = 0; c < 5; c++) {
			if (c == 2) {
				continue;
			}
			System.out.println("c = " + c);
		}
	}
}
