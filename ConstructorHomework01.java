import java.util.Scanner;
public class ConstructorHomework01 {
	public static void main(String[] args) {
		//Homework01
		A01 a01 = new A01();
		double[] array = {3.2, 5.9, -6.0, -9.2, 5.7};
		//System.out.println(a01.max(array));
		Double res = a01.max(array);
		if(res != null) {
			System.out.println(res);
		} else {
			System.out.println("array不能为null或{}");
		}
		//Homework02
		A02 a02 = new A02();
		String[] strs = {"AAA", "5.968", "xiao", "李天", "name"};
		System.out.println(a02.find(strs, "xiao"));
		//Homework03
		Book book = new Book("《JAVA学习》", 118.0);
		System.out.println(book.price);
		book.updatePrice();
		System.out.println(book.price);
		//Homework04
		A03 a03 = new A03();
		int[] arr = {209, 98, 113, 57,42};
		int[] newArr = a03.copyArr(arr);
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		//Homework05
		Circle circle = new Circle();
		circle.r = 5; //可以使用带形参的构造器
		circle.circleLong();
		circle.circleArea();
		//Homework06
		Cale cale1 = new Cale();
		cale1.a = 15;
		cale1.b = 3;
		System.out.println("和；" + cale1.sum());
		System.out.println("差；" + cale1.difference());
		Cale cale2 = new Cale();
		cale2.a = 43;
		cale2.b = 10;
		System.out.println("积；" + cale2.product());
		//System.out.println("商；" + cale2.ratio());
		if(cale2.ratio() != null) {
			System.out.println("商；" + cale2.ratio());
		} else {
			System.out.println("除数b不能为0");
		}
		//Homework07
		Dogg dog1 = new Dogg();
		dog1.name = "hei";
		dog1.color = "黑色";
		dog1.age = 2;
		dog1.show();
		//Homework09
		Music song1 = new Music();
		song1.name = "Love";
		song1.times = 261.63;
		System.out.println(song1.getInfo());
		//Homework11
		new TestMethod();
		//Homework12
		Employeee p1 = new Employeee("李明", '男', 33, "销售经理", 8000.0);
		System.out.println(p1.name + " " + p1.gender + " " + p1.age 
				+ " " + p1.position + " " + p1.salary);
		//Homework13
		Circlee circlee = new Circlee();
		PassObject po = new PassObject();
		po.printAreas(circlee, 5);
	}
}
//Homework01
class A01 {
	/*
	public double max(double[] array) {
		double max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	*/
	//代码健壮性提升
	public Double max(double[] array) {
		if(array != null && array.length > 0) {
			double max = array[0];
			for(int i = 1; i < array.length; i++) {
				if(max < array[i]) {
					max = array[i];
				}
			}
			return max;
		} else {
			return null;
		}
	}
}
//Homework02
class A02 {
	public int find(String[] strs, String str) {
		/*
		int index = -1;
		for(int i = 0; i < strs.length; i++) {
			if(str.equals(strs[i])) {
				index = i;
				break;
			}
		}
		return index;
		*/
		//代码精简
		for(int i = 0; i < strs.length; i++) {
			if(str.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
}
//Homework03
class Book {
	String name;
	double price;
	public Book(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		if(this.price > 150) { //没有形参时也可以不写this
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
}
//Homework04
class A03 {
	public int[] copyArr(int[] arr) {
		int[] arr01 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr01[i] = arr[i];
		}
		return arr01;
	}
}
//Homework05
class Circle {
	double T = 3.14; //使用“Math.Pi”更准确
	double r;
	public void circleLong() {
		double circleLong = 2 * r * T;
		System.out.println("半径为 " + r + " 的圆，周长是 " + circleLong);
	}
	public void circleArea() {
		double circleArea = r * r * T;
		System.out.println("半径为 " + r + " 的圆，面积是 " + circleArea);
	}
}
//Homework06
class Cale {
	double a;
	double b;
	public double sum() {
		return this.a + this.b;
	}
	public double difference() {
		return this.a - this.b;
	}
	public double product() {
		return this.a * this.b;
	}
	/*
	public String ratio() {
		if(this.b == 0.0) {
			return "除数b不能为0";
		} else {
			return this.a / this.b + "";
		}
	}
	*/
	//使用包装类接收包含null类型的数值
	public Double ratio() {
		if(this.b == 0.0) {
			return null;
		} else {
			return this.a / this.b;
		}
	}
}
//Homework07
class Dogg {
	String name;
	String color;
	int age;
	public void show() {
		System.out.println("狗名字：" + this.name);
		System.out.println("狗颜色：" + this.color);
		System.out.println("狗年龄：" + this.age);
	}
}
//Homework09
class Music {
	String name;
	double times;
	public void play() {
		System.out.println(this.name + "正在播放");
	}
	public String getInfo() {
		int min = (int)(this.times / 60);
		int sec = (int)Math.round(this.times % 60);
		return "歌曲名：" + this.name + "，歌曲时长：" 
				+ min + " 分" + sec +" 秒";
	}
}
//Homework11
class TestMethod {
	public TestMethod() {
		System.out.println(method(method(10.0, 280.0), 100));
	}
	/*
	public int method(double a, double b) {
		return (int)(Math.ceil(Math.max(a, b)));
	}
	public int method(int a, double b) {
		return (int)Math.max(a, b);
	}
	*/
	//纠正
	public double method(double a, double b) {
		//举个例子而已
		return Math.max(a, b);
	}
}
//Homework12
class Employeee {
	String name;
	char gender;
	int age;
	String position;
	double salary;
	/*没有复用构造器
	public Employeee(String name, char gender, int age, 
			String position, double salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	*/
	public Employeee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employeee(String position, double salary) {
		this.position = position;
		this.salary = salary;
	}
	public Employeee(String name, char gender, int age, 
			String position, double salary) {
		this(name, gender, age); //调用其他构造器只能用一次且要放在首行
		this.position = position;
		this.salary = salary;
	}
}
//Homework13
class Circlee {
	double radius;
	public double findAera() {
		return radius * radius * 3.14;
	}
	public void setr(double radius) {//加了个方法
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circlee c, int times) {
		if(times >= 1) {
			System.out.println("Radius\tArea");
			for(int i = 1; i <= times; i++) {
				//c.radius = i;
				c.setr(i);
				System.out.println(c.radius + "\t" + c.findAera());
			}
		} else {
			System.out.println("第二个参数请输入不小于1的整数");
		}
	}
}
//Homework14
