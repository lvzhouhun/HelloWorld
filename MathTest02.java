public class MathTest02 {
	
	private static void printinfo(double i) {
		System.out.println("Math.floor(" + i + ") = " + Math.floor(i));
		System.out.println("Math.ceil(" + i + ") = " + Math.ceil(i));
		System.out.println("Math.round(" + i + ") = " + Math.round(i));
	}
	
	public static void main(String[] args) {
		double [] sz = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
		for(double i : sz) {
			printinfo(i);
		}
	}
}