package test;
public class Manager extends Employee {
	//独特属性
	private double bonus;
	//继承复用父类构造器，并添加新属性
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	//独特属性读写方法
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	//重写父类方法
	public double getAnnual() {
		return super.getAnnual() + bonus;
	}
	//独特方法
	public void manage() {
		System.out.println("经理 " + getName() + " 正在管理中……");
	}
}