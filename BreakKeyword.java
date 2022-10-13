public class BreakKeyword {
	public static void main(String[] args) {
		int [] sz = {1,3,5,7,9};
		for(int i : sz) {
			System.out.print(i);
			// 当i等于5时跳出循环
			if(i == 5) {
				break;
			}
			System.out.print(",");
		}
	}
}