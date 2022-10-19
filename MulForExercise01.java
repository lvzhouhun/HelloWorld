import java.util.Scanner;
public class MulForExercise01 {
	public static void main(String[] args) {
		//统计3个班的成绩，每个班5个学生，求出各个班和所有班的平均分和及格人数（成绩从键盘输入）
		Scanner myScanner = new Scanner(System.in);
		double totalSumScore = 0;
		int totalPassNum = 0;
		for(int i = 1; i <= 3; i++) {
			//统计各个班级
			double sumScore = 0;
			int passNum = 0;
			for(int j = 1; j <= 5; j++) {
				System.out.println("请输入第 " + i + " 班的第 " + j + " 个学生的成绩：");
				double score = myScanner.nextDouble();
				sumScore += score;
				if(score >= 60) {
					passNum++;
				}
			}
			//输出各个班级的成绩信息
			System.out.println("第 " + i + " 班的平均成绩为：" + sumScore / 5);
			System.out.println("第 " + i + " 班的及格人数为：" + passNum);
			//统计所有班级
			totalSumScore += sumScore;
			totalPassNum += passNum;
		}
		//输出所有班级的成绩信息
		System.out.println("所有班级的平均成绩为：" + totalSumScore / 15);
		System.out.println("所有班级的及格人数为：" + totalPassNum);
	}
}