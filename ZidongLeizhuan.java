public class ZidongLeizhuan {
	public static void main(String[] args) {
		char c1 = 'a';
		int i1 = c1;
		System.out.println("char类型自动转换为int类型后的值为：" + i1);
		char c2 = 'A';
		int i2 = c2+1;
		System.out.println("char类型与int类型计算后的值为：" + i2);
		/*c1 的值为字符 a ,查 ASCII 码表可知对应的 int 类型值为 97，
		  A 对应值为 65，所以 i2=65+1=66。*/
	}
}