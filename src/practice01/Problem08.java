package practice01;

import java.util.Scanner;

public class Problem08 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int balance=0;
	
	boolean isRunning = true;
	while(isRunning) {
		System.out.println("--------------------------------");
		System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("--------------------------------");
		System.out.print("선택>");
		int num = scan.nextInt();
				
		switch(num) {
		case 1 : 
			System.out.print("예금액>");
			int deposit = scan.nextInt();
			scan.nextLine();
			balance+=deposit;
			break;
		case 2 : 
			System.out.print("출금액>");
			int withdraw = scan.nextInt();
			scan.nextLine();
			if(balance<withdraw) {
				System.out.println("잔액이 부족합니다.");
			}else { balance-=withdraw; }
			break;
		case 3 : 
			System.out.print("잔액>");
			System.out.println(balance);
			break;
		case 4 :
			System.out.println("프로그램 종료");
			isRunning = false;
		}
	}
}
}
