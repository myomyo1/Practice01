package practice02;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
 		int money = 0;
 		int number = 0; 
 		int[] won = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; 
 
  		System.out.print("금액 : "); 
 		money = scan.nextInt(); 
  
 		for (int i = 0; i < won.length; i++) { 
 			if (money >= won[i]) { 
 				number = money / won[i]; 
 				money -= number * won[i]; 
 				System.out.println(won[i] + "원 : " + number + "개"); 
 			} 
 		} 
			
		scan.close();
	}
}
