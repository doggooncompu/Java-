import java.util.Scanner;

public class athers{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("NUMBER SPLITTER ");
      
      //input number
      System.out.println("enter number: ");
      double res = scan.nextDouble();

      //get the first few numbers (/100 to get first two numbers to be whole number)
      
      int g_num =  (int) res/100;
     double calc = res/100;
      double calc2 = ((double) calc- (double)g_num);
      int l_num = (int) ((calc2) * 100);
      
      System.out.println("First side: " + g_num);  
       System.out.println("g_num: " + g_num);  
      System.out.println("calc:  " + calc);
      System.out.println("calc2:  " + calc2);    
      System.out.println("Second side: " + l_num);
      
      
    }
}