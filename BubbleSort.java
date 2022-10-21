public class BubbleSort {
	public static void main(String[] args) {
		int[] arr01 = {38, 0, -2, 99, 66, 5, -200, 500};
		System.out.println("初始数组元素为：");
		for(int k = 0; k < arr01.length; k++) {
			System.out.print(arr01[k] + "\t");
		}
		int temp01 = 0;
		//外层循环（数组长度-1）次（确定最大值的次数）
		for(int i = 0; i <= arr01.length - 2; i++) {
			//内层循环次数跟随外层循环逐渐减少（每确定一次最大值后，缩小两两比较的范围）
			for(int j = 0; j <= arr01.length - 2 - i; j++) {
				if(arr01[j] > arr01[j+1]) {
					temp01 = arr01[j];
					arr01[j] = arr01[j+1];
					arr01[j+1] = temp01;
				}
			}
			System.out.println("\n第 " + (i + 1) + " 次排序后的结果是：");
			for(int k = 0; k < arr01.length; k++) {
				System.out.print(arr01[k] + "\t");
			}
		}
	}
}