public class DefaultValue {
	static byte by;
	static short sh;
	static int it;
	static long lg;
	static float ft;
	static double db;
	static boolean bool;
	static char ch;
	static String str;
	
	public static void main(String[] args) {
		System.out.println("Byte: " + by);
		System.out.println("Short: " + sh);
		System.out.println("Integer: " + it);
		System.out.println("Long: " + lg);
		System.out.println("Float: " + ft);
		System.out.println("Double: " + db);
		System.out.println("Boolean: " + bool);
		System.out.println("Character: " + (int)ch);
		System.out.println("String: " + str);
	}
}