import java.util.Scanner;
public class ArrayHomework04 {
	public static void main(String[] args) {
		/*
		//已知一个升序数组
		int[] arr = {10, 12, 45, 90, 100};
		//输出原始数组的元素
		System.out.println("原始数组的元素为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//输入一个整数（准备添加到数组中并仍以升序排列）
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\n请插入一个整数并按升序排列：");
		int num = myScanner.nextInt();
		//创建一个新数组，元素比原来多一个
		int[] arr01 = new int[arr.length + 1];
		//获取插入的坐标
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			//正常复制
			arr01[i] = arr[i];
			//若新元素比当前赋值元素还小，就进行替换，同时获取替换时的坐标，退出复制循环
			if(num < arr[i]) {
				arr01[i] = num;
				index = i;
				break;
			} else { //若新元素不比所有旧元素小，则将新元素赋值给新数组的最后一位
				arr01[arr.length] = num;
			}
		}
		//若获取到坐标，则继续进行新旧元素的复制
		if(index != -1) {
			for(int i = index; i < arr.length; i++) {
				arr01[i + 1] = arr[i];
			}			
		}
		//输出新数组的元素
		System.out.println("\n新数组的元素为：");
		for(int i = 0; i < arr01.length; i++) {
			System.out.print(arr01[i] + " ");
		}
		*/
		//---------------------------------------------
		//改变思路：先定位，再扩容赋值
		//---------------------------------------------
		//已知一个升序数组
		int[] arr = {10, 12, 45, 90, 100};
		//输出原始数组的元素
		System.out.println("原始数组的元素为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//输入一个整数（准备添加到数组中并仍以升序排列）
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\n请插入一个整数并按升序排列：");
		int num = myScanner.nextInt();
		//创建一个新数组，元素比原来多一个
		int[] arr01 = new int[arr.length + 1];
		//获取在新数组中要插入的坐标
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(num <= arr[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			index = arr.length; //若新元素比所有旧元素都大，则准备插入到新数组的末位
		}
		//进行元素的复制
		/*
		for(int i = 0; i < arr01.length; i++) {
			if(i < index) {
				arr01[i] = arr[i];
			} else if(i == index) {
				arr01[i] = num;
			} else {
				arr01[i] = arr[i-1];
			}
		}*/
		//进行元素的复制(其他方法)
		for(int i = 0, j = 0; i < arr01.length; i++) {
			if(i == index) {
				arr01[i] = num;
				//跳过j++
			} else {
				arr01[i] = arr[j];
				j++;
			}
		}
		//将原数组指向新数组，实现原数组的数据更新
		arr = arr01;
		//输出数组更新后的元素
		System.out.println("\n数组更新后的元素为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}