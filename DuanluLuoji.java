public class DuanluLuoji {
	public static void main(String[] args) {
		int a = 5;
		boolean b = (a<4)&&(++a<10);
		System.out.println("使用短路逻辑运算符的计算结果是：" + b 
				+ '\n' + "最后a的值是：" + a);
	}
}