package test;
public class Test00 {
	public static void main(String[] args) {
		//Person, Student
		Person person = new Person("Tom", 10);
		System.out.println(person.say());
		Student student = new Student("Lei", 20, 1000, 98);
		System.out.println(student.say());
		System.out.println("==========================");
		//Employee, Worker, Manager
		Worker liming = new Worker("李明", 2000);
		Manager wanglu = new Manager("王路", 5000, 10000);
		Test00 t1 = new Test00();
		t1.showEmpAnnual(liming);
		t1.showEmpAnnual(wanglu);
		t1.showWorking(liming);
		t1.showWorking(wanglu);
		System.out.println("==========================");
	}
	//方法一
	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());
	}
	//方法二
	public void showWorking(Employee e) {
		if(e instanceof Worker) {
			((Worker)e).work(); //向下转型调用独特方法
		} else if(e instanceof Manager) {
			((Manager)e).manage();
		} else {
			System.out.println("参数有误……");
		}
	}
}