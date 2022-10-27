package test;
public class Employee {
	//父类属性
	private String name;
	private double salary;
	//父类构造器
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	//父类属性读写方法
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	//父类方法
	public double getAnnual() {
		return salary * 12;
	}
}