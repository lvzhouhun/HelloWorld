import java.util.Scanner;
public class YangHui01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数：");
		int rows = myScanner.nextInt();
		//分配空间
		int[][] yanghui01 = new int[rows][]; //分配第1层空间
		for(int i = 0; i < yanghui01.length; i++) {
			yanghui01[i] = new int[i + 1]; //分配第2层空间
		}
		//赋值
		for(int i = 0; i < yanghui01.length; i++) {
			for(int j = 0; j < yanghui01[i].length; j++) {
				if(j == 0 || j == yanghui01[i].length-1) {
					yanghui01[i][j] = 1; //头尾赋值
				} else { //else if(i > 1) {
					yanghui01[i][j] = yanghui01[i-1][j]
								  + yanghui01[i-1][j-1]; //其他赋值
				}
			}
		}
		//输出
		System.out.println("下面是 " + rows + " 行的杨辉三角：");
		for(int i = 0; i < yanghui01.length; i++) {
			for(int j = 0; j < yanghui01[i].length; j++) {
				System.out.print(yanghui01[i][j] + " ");
			}
			System.out.println();
		}
	}
}