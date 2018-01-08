package practice01;

import java.util.Scanner;

public class Problem05 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자를 입력하세요.");


	int number_array[] = new int[5];
	
	for(int i=0; i<5; i++) {
		System.out.print("숫자 : ");
		number_array[i]=scan.nextInt();
	}
	
	int max = number_array[0];
	for(int j=0; j<number_array.length ; j++) {
		if(number_array[j]>=max) {
			max=number_array[j];
		}
	}
	System.out.println("최대값은 " + max + " 입니다");
	
	scan.close();
	
	
	
}
}
