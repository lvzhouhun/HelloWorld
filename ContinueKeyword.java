public class ContinueKeyword {
   public static void main(String[] args) {
      int [] sz = {1, 3, 5, 7, 9};
 
      for(int i : sz ) {
    	  //当i等于5时跳出此次循环（不输出5和“，”）
          if( i == 5 ) {
        	  continue;
          }
          System.out.print( i );
        //当i等于9时终止循环（不输出“，”）
          if( i == 9 ) {
        	  break;
          }
          System.out.print(",");
      }
   }
}