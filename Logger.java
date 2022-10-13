public class Logger {
	/*Logger 类中的 nm 变量为私有变量，所以其他类不能直接得到和设置该变量的值。
	 * 为了使其他类能够操作该变量，定义了两个 public 方法：
	 * getNm() （返回 nm的值）和 setNm(int)（设置 nm 的值）*/
	private int nm;
	public int getNm() {
		return this.nm;
	}
	public void setNm(int i) {
		this.nm = i;
	}
}