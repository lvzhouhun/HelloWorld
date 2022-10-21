public class ArrayHomework05 {
	public static void main(String[] args) {
		//随机生成10个整数（1-100范围）并保存到数组
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			/*
			int randomNum = (int)(Math.random()*100);
			if(randomNum == 0) {
				randomNum = 1;
			}
			*/
			int randomNum = (int)(Math.random()*100)+1;
			arr[i] = randomNum;
		}
		System.out.println("原始数组为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//倒序打印输出
		System.out.println("\n数组倒序输出为：");
		for(int i = arr.length - 1; i >= 0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		//求平均值
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("\n平均值为：" + (sum/arr.length));
		//求最大值和最大值的下标
		int max = -1,maxIndex = -1;
		/*
		for(int m = 100; m >= 1; m--) {
			for(int i = 0; i < arr.length; i++) {
				if(m == arr[i]) {
					max = m;
					maxIndex = i;
					break;
				}
			}
			if(max != -1) {
				break;
			}
		}
		*/
		//更好的方法
		max = arr[0];
		maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值是：" + max);
		System.out.println("最大值的下标是：" + maxIndex);
		//查找里面是否有8
		boolean bool8 = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 8) {
				bool8 = true;
			}
		}
		if(bool8) {
			System.out.println("数组里有8");
		} else {
			System.out.println("数组里没有8");
		}
	}
}