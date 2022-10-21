import java.util.Scanner;
public class ArrayReduce01 {
	public static void main(String[] args) {
		int[] array01 = {1, 2, 3, 4, 5};
		System.out.print("数组array01的初始元素为：");
		for(int i = 0; i < array01.length; i++) {
			System.out.print(array01[i] + " ");
		}
		int reduceCount = 0;
		//连续询问是否缩减元素
		while(true) {
			System.out.print("\n是否缩减一个元素：y/n?");
			Scanner myScanner = new Scanner(System.in);
			char yn = myScanner.next().charAt(0);
			if(yn == 'y') {
				if(array01.length == 1) {
					System.out.print("\n只剩一个元素，不能再缩减了");
					break;
				}
				int[] array02 = new int[array01.length - 1];
				for(int i = 0; i < array01.length - 1; i++) {
					array02[i] = array01[i];
				}
				array01 = array02;
				reduceCount++;
				System.out.print("\n缩减" + reduceCount + "次元素后，数组array01的元素为：");
				for(int i = 0; i < array01.length; i++) {
					System.out.print(array01[i] + " ");
				}
				
			} else if(yn == 'n') {
				break;
			}
		}
	}
}