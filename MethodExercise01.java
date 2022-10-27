//主类
public class MethodExercise01 {
	//主类中的主方法
	public static void main(String[] args) {
		//调用同一类中的方法
		//判断一个数是不是奇数的方法
		if(ifOdd(39)) {
			System.out.println("是奇数");
		} else {
			System.out.println("不是奇数");
		}
		//调用其他类中的方法
		//根据行、列、字符实现打印
		PrintChar printChar = new PrintChar();
		printChar.printChar01(3, 5, 'x');
	}
	//主类的其他方法
	public static boolean ifOdd(int num) {
		return num % 2 != 0;
	}
	
}
//另一个类
class PrintChar {
	//另一个类中的方法
	public void printChar01(int row, int col, char chr) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(chr);
			}
			System.out.println();
		}
	}
}