public class LocalVariable {
	public void LocalVariable() {
		/*每个类都有构造方法。如果没有显式地为类定义构造方法，
		 * Java 编译器将会为该类提供一个默认构造方法。*/
	}
	public void pupAge() {
		int age = 0;
		age = age + 8;
		System.out.println("这只小狗的年龄是：" + age + "岁");
	}
	
	public static void main(String[] args) {
		LocalVariable xiaohei = new LocalVariable();
		xiaohei.pupAge();
	}
}