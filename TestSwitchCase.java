public class TestSwitchCase {
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
		case 'C':
			System.out.println("良好");
			break;
		case 'D':
			System.out.println("及格");
			break;
	    default:
	    	System.out.println("等级未知");
		}
		System.out.println("等级是" + grade);
		
		
		System.out.println("\n");
		int i = 1;
		switch(i) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		}
		
		
	}
}