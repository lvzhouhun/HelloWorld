import java.util.Scanner;
public class ArrayAdd01 {
	public static void main(String[] args) {
		int[] array01 = {1, 2, 3};
		System.out.print("数组array01的初始元素为：");
		for(int i = 0; i < array01.length; i++) {
			System.out.print(array01[i] + " ");
		}
		//添加一个元素
		int addCount = 0;
		int[] array02 = new int[array01.length + 1];
		for(int i = 0; i < array01.length; i++) {
			array02[i] = array01[i];
		}
		array02[array01.length] = 4;
		array01 = array02;
		addCount++;
		System.out.print("\n添加第" + addCount + "个元素后，数组array01的元素为：");
		for(int i = 0; i < array01.length; i++) {
			System.out.print(array01[i] + " ");
		}
		//连续询问是否添加元素
		while(true) {
			System.out.print("\n是否继续添加第" + (addCount+1) + "个元素：y/n?");
			Scanner myScanner = new Scanner(System.in);
			char yn = myScanner.next().charAt(0);
			if(yn == 'y') {
				System.out.print("请输入一个整数：");
				int a1 = myScanner.nextInt();
				//继续添加一个元素
				int[] array03 = new int[array01.length + 1];
				for(int i = 0; i < array01.length; i++) {
					array03[i] = array01[i];
				}
				array03[array01.length] = a1;
				array01 = array03;
				addCount++;
				System.out.print("\n添加第" + addCount + "个元素后，数组array01的元素为：");
				for(int i = 0; i < array01.length; i++) {
					System.out.print(array01[i] + " ");
				}
			} else if(yn == 'n') {
				break;
			}
		}
	}
}