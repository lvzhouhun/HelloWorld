package test;
public class Worker extends Employee {
	//继承复用父类构造器
	public Worker(String name, double salary) {
		super(name, salary);
	}
	//重写父类方法
	public double getAnnual() {
		return super.getAnnual();
	}
	//独特方法
	public void work() {
		System.out.println("员工 " + getName() + " 正在工作中……");
	}
}