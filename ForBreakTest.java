import java.util.Scanner;
public class ForBreakTest {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		//提前声明两个输入要存储的变量
		String name , password;
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入用户名：");
			name = myScanner.next();
			System.out.println("请输入密码：");
			password = myScanner.next();
			//验证两个字符串（使用equals）
			if("丁真".equals(name) && "666".equals(password)) {
				System.out.println("登录成功！");
				break;
			} else {
				System.out.println("用户名或密码错误，还剩 " + (3-i) + " 次登录机会");
			}
		}
	}
}