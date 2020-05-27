import java.util.Scanner;
public class center_pattern{ 
public static void main(String[] args){
	System.out.println("How many rows do you need?");
	Scanner readinput=new Scanner (System.in);
	int rows=readinput.nextInt();
	int k = 0;
 for(int i = 1; i <= rows; ++i, k = 0) {
	 for(int space = 1; space <= rows - i; ++space) {
		 System.out.print("  ");
		 }
		 while(k != 2 * i - 1) {
			 System.out.print("* "); 
			 ++k; 
			 }
			 System.out.println();
			 }
}
}
