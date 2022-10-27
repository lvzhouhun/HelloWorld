package test;
public class Person {
	//属性
	private String name;
	private int age;
	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//方法
	public String say() {
		return "name is " + name + ", age is " + age;
	}
	//属性读写方法
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}