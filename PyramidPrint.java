import java.util.Scanner;
public class PyramidPrint {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入金字塔的层数：");
		int rowNum = myScanner.nextInt();
		//简单难度
		System.out.println("\n简单难度：");
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//中等难度
		System.out.println("\n中等难度：");
		for(int i = 1; i <= rowNum; i++) {
			for(int k = 1; k <= rowNum-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//有点困难
		System.out.println("\n有点困难：");
		for(int i = 1; i <= rowNum; i++) {
			//每行靠前的空格
			for(int k = 1; k <= rowNum-i; k++) {
				System.out.print(" ");
			}
			//每行靠后的*和空格
			for(int j = 1; j <= i * 2 - 1; j++) {
				boolean iftrue = j == 1 || j == i * 2 - 1 || i == rowNum; 
				if(iftrue) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		//扩展难度（打印空心菱形）
		System.out.println("\n扩展难度（打印空心菱形）：");
		//上半部分
		for(int i = 1; i <= rowNum / 2 + 1; i++) {
			//每行靠前的空格
			for(int k = 1; k <= rowNum / 2 + 1 - i; k++) {
				System.out.print(" ");
			}
			//每行靠后的*和空格
			for(int j = 1; j <= i * 2 - 1; j++) {
				boolean iftrue = j == 1 || j == i * 2 - 1; 
				if(iftrue) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		//下半部分
		for(int i = 2; i <= rowNum / 2 + 1; i++) {
			//每行靠后的*和空格
			for(int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			//每行靠后的*和空格
			int starNum = 2 * (rowNum / 2 + 1 - i + 1) - 1;
			for(int j = 1; j <= starNum; j++) {
				//System.out.print("*");
				boolean iftrue = j == 1 || j == starNum; 
				if(iftrue) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}