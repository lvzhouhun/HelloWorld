public class ArrayHomework07 {
	public static void main(String[] args) {
		int[] arr = {7, 30, 50, 20, 10, -3};
		int temp = 0;
		for(int j = 0; j < arr.length - 1; j++) {
			for(int i = 0; i < arr.length - 1 - j; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}