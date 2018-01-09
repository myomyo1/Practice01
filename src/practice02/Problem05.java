package practice02;

import java.util.HashSet;

public class Problem05 {
	public static void main(String[] args) {

		int num_array[] = new int[6];
		int count=0;
		while(count<6) {
		getlottonum : for(int i = 0; i < num_array.length; i++) {  //6번돌릴꺼
			int random_number = (int) ((Math.random() * 45) + 1); //랜덤값random_number에 저장 
			for(int j=0; j<i; j++) {
				if(num_array[j]==random_number) {
					continue getlottonum;
				}
			}
			num_array[i]=random_number;//랜덤값 배열에 저장
			System.out.println(num_array[i]);
			count++;
		}
		}	
			
	
		
//		HashSet<Integer> set = new HashSet<>(); //set만들고
//		while(set.size()<6) { //6넘어가면 while문 밖으로
//			int j=(int) ((Math.random() * 45) + 1); //랜덤
//			set.add(j);
//		}
//		for(int lotto : set) {
//			System.out.print(lotto+ " ");
//		}
		
		
}		
}
