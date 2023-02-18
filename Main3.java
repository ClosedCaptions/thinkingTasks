package thinkingTasks;

public class Main3 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++){
			int ones = i % 10;
			int tens = i/10;
			int hundreds = i/100;
			if (ones == 7){
				System.out.println(i + " " + ones);
				count++;
			}
			if (tens == 7){
				System.out.println(i + " " + tens);
				count++;
			}
			if (hundreds == 7){
				System.out.println(i + " " + hundreds);
				count++;
			}
		}
		System.out.println(count);
	}

}
