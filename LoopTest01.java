import java.util.Scanner;
public class LoopTest01 {
	public static void main(String[] args) {
		//第1题
		System.out.println("第1题答案：");
		double money = 100000;
		int num = 0;
		while(num < 10000) { //while(true) { ……
			if(money > 50000) {
				money -= money*5/100; //money *= 0.95;
				//num++;
			} else if(money >= 1000) {
				money -= 1000;
				//num++;
			} else break;
			num++;
		}
		System.out.println("可以经过 " + num + " 次路口");
		//第2题
		System.out.println("\n第2题答案：");
		Scanner myScanner01 = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num01 = myScanner01.nextInt();
		if(num01 > 0) {
			System.out.println("该整数大于0");
		} else if(num01 < 0) {
			System.out.println("该整数小于0");
		} else {
			System.out.println("该整数等于0");
		}
		//第3题
		System.out.println("\n第3题答案：");
		Scanner myScanner02 = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year01 = myScanner02.nextInt();
		if((year01 % 4 == 0 && year01 % 100 != 0) 
			||year01 % 400 == 0) {
			System.out.println(year01 + "年是闰年");
		} else {
			System.out.println(year01 + "年不是闰年");
		}
		//第4题
		System.out.println("\n第4题答案：");
		Scanner myScanner03 = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num02 = myScanner03.nextInt();
		if(num02 > -1000 && num02 < 1000) {
			int bai = num02 / 100;
			int shi = (num02 - bai * 100) / 10; //num02 % 100 /10
			int ge = num02 % (bai + shi); //num02 % 10
			if(bai*bai*bai + shi*shi*shi + ge*ge*ge == num02) {
				System.out.println(num02 + "该整数是水仙花数");
			} else {
				System.out.println(num02 + "该整数不是水仙花数");
			}
		} else {
			System.out.println(num02 + "该整数不是水仙花数");
		}
		//第5题
		System.out.println("\n第5题答案：");
		int m = 0, n = 3;
		if(m > 0) {
			if(n > 2)
				System.out.println("OK1");
			else
				System.out.println("OK2");
		}
		//第6题
		System.out.println("\n第6题答案：");
		int num06 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				num06++;
				if(num06 % 5 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i+" ");
				}
				/*
				 * System.out.print(i+"\t");
				 * if(num06 % 5 == 0) {
				 * 	System.out.println();
				 * }
				*/
			}
		}
		//第7题
		System.out.println("\n第7题答案：");
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println();
		for(char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1 + " ");
		}
		//第8题
		System.out.println("\n \n第8题答案：");
		double sum08 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum08 += 1.0/i;
			} else {
				sum08 -= 1.0/i;
			}
		}
		System.out.println("1-1/2+1/3-1/4……1/100的和是：" + sum08);
		//第9题
		System.out.println("\n第9题答案：");
		int sum09 = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 100; j >= 1; j--) {
				if(i + j == 101) {
					sum09 += i * j;
				}
			}
		} 
		/*
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				sum09 += j;
			}
		} 
		*/
		System.out.println("1+(1+2)+(1+2+3)+……+(1+2+3+..+100)的结果是：" + sum09);
	}
}