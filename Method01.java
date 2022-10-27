public class Method01 {
	public static void main(String[] args) {
		Score score = new Score();
		System.out.println(score.scores("李雷", 79, 81, 100, 65.6));
	}
}

class Score {
	public String scores(String name, double... score) {
		double totalScore = 0;
		for(int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		return name + "有" + score.length + "门课，总分是：" + totalScore;
	}
}