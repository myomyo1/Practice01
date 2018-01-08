package practice02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num_array[] = new int[5];
		
		int total=0;
		double avg = 0;
		
		for(int i=0; i<num_array.length ; i++) {
			num_array[i]=scan.nextInt();
			total += num_array[i];
			avg = total/num_array.length;
		}
		System.out.println("평균은" + avg +"입니다.");
		
		scan.close();
				
	}
}
