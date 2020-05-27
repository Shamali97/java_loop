import java.util.Scanner;
public class left_pattern{
	public static void main(String[]args){
		System.out.println("How many lines do you need?");
		Scanner readinput =new Scanner (System.in);
		int i = readinput.nextInt();
		
		for(int k=1;k<=i;k++){
			for(int j=1;j<=k;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
	}