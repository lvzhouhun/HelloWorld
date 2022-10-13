public class InstanceCounter {
	//私有静态变量numInstances，初始值为0
	private static int numInstances = 0;
	//受保护的静态方法getCounter()，返回值为numInstancesd的值
	protected static int getCount() {
		//静态方法只能使用类的静态变量？
		return numInstances;
	}
	//私有静态方法addInstance(),执行numInstances自增运算，无返回值
	private static void addInstance() {
		//静态方法只能使用类的静态变量？
		numInstances++;
	}
	//默认访问控制权限的构造方法（与类同名），执行addInstance()
	InstanceCounter() {
		InstanceCounter.addInstance();
	}
	/*公共静态main方法（无返回值），
	 *执行一次getCount()并输出numInstances的初始值0,
	 *利用for循环执行500次构造方法InstanceCounter()，
	 *在循环过程中numInstances的值从0自增500次，变为500，
	 *再次执行一次getCount()并输出numInstances的最新值500*/
	public static void main(String[] args) {
		System.out.println("Starting with " + 
				InstanceCounter.getCount() + " instances");
		for(int i = 0; i < 500; ++i) {
			new InstanceCounter();
		}
		System.out.println("Created " + 
				InstanceCounter.getCount() + " instances");
	}
}