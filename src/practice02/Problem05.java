package practice02;

import java.util.HashSet;

public class Problem05 {
	public static void main(String[] args) {

//		int num_array[] = new int[6];
//		int count=0;
//		while(count<6) {
//		getlottonum : for(int i = 0; i < num_array.length; i++) {  //6번돌릴꺼
//			int random_number = (int) ((Math.random() * 45) + 1); //랜덤값random_number에 저장 
//			for(int j=0; j<i; j++) {
//				if(num_array[j]==random_number) {
//					continue getlottonum;
//				}
//			}
//			num_array[i]=random_number;//랜덤값 배열에 저장
//			System.out.println(num_array[i]);
//			count++;
//		}
//		}
		
		int[] lotto = new int[6];
		int random_number =0;
		for(int i=0; i<6;i++) {
			random_number=(int)(Math.random()*45+1);
			lotto[i]=random_number;
			
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					random_number=(int)(Math.random()*45+1);
					lotto[i]=random_number;
					j=0;
					break;
				}
			}System.out.print(lotto[i]+" ");
		}
			
	
		
}		
}
