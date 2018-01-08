package practice01;

import java.util.Scanner;

public class Problem07 {
public static void main(String[] args) {
	
	int number = (int) ((Math.random()*100)+1);
	Scanner scan = new Scanner(System.in);
	
	System.out.println("============================");
	System.out.println("      [숫자맞추기게임 시작]       ");
	System.out.println("============================");
	
	boolean isRunning = true;
	while(isRunning) {
		int guessing_number = scan.nextInt();
		scan.nextLine();
		if(guessing_number<number) {
			System.out.println("더 높게 >>");
		}else if(guessing_number>number) {
			System.out.println("더 낮게 >>");
		}else if(guessing_number==number) {
			System.out.println("맞았습니다.");
			System.out.println("게임을 종료하시겠습니까? (y/n)");
			String game=scan.nextLine();
			if(game.equals("y")) {
				System.out.println("게임을 종료합니다.");
				isRunning = false;
			}
		}
	}
	
	scan.close();
}
}
