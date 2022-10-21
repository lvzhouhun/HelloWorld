public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		int[][] arr01;
		arr01 = new int[10][];
		//分配空间
		for(int i = 0; i < arr01.length; i++) {
			arr01[i] = new int[i + 1];
			//赋值
			for(int j = 0; j < arr01[i].length; j++) {
				//arr01[i] = new int[j + 1];
				//arr01[i].length = j +1;
				arr01 [i][j] = i + 1;
			}
		}
		//遍历数组，输出元素
		for(int i = 0; i < arr01.length; i++) {
			for(int j = 0; j < arr01[i].length; j++) {
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println();
		}
	}
}