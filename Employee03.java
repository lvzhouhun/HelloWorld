import java.io.*;

public class Employee03 {
	//声明一个私有的，静态的类变量（静态变量）salary
	private static double salary;
	//声明一个常量DEPARTMENT并初始化赋值
	public static final String DEPARTMENT = "开发部门";
	public static void main(String[] args) {
		//对未经初始化的静态变量赋值
		salary = 10000;
		System.out.println(DEPARTMENT + "的工资是：" + salary);
	}
}