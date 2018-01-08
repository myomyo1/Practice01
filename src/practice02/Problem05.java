package practice02;

public class Problem05 {
	public static void main(String[] args) {

		int num_array[] = new int[6];

		for (int i = 0; i < num_array.length; i++) {
			int random_number = (int) ((Math.random() * 45) + 1);
			num_array[i] = random_number;
			System.out.print(num_array[i]+ " ");
		}
	}
}
