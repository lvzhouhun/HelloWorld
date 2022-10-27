package test;
public class Student extends Person {
	//子类属性
	private int id;
	private double score;
	//子类构造器
	public Student(String name, int age, int id, double score) {
		super(name, age); //调用父类构造器
		this.id = id;
		this.score = score;
	}
	//子类方法
	public String say() { //调用父类方法
		return super.say() + ", id is " + id + ", score is " + score;
	}
	//子类属性读写方法
	public void setId(int id) {
		this.id = id;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
}