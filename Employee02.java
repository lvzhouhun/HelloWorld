//import java.io.*;

public class Employee02 {
	//这个实例变量对子类可见
	public String name;
	//私有变量，仅在该类可见
	private int age;
	//在构造器中对实例变量name赋值
	public Employee02(String nm) {
		name = nm;
	}
	//使用方法对实例变量age赋值
	public void setAge(int ag) {
		age = ag;
	}
	//使用方法输出信息
	public void printInfo() {
		System.out.println("姓名是：" + name);
		System.out.println("年龄是" + age);
	}
	public static void main(String[] args) {
		Employee02 song = new Employee02("宋亮");
		song.setAge(23);
		song.printInfo();
	}
	
}