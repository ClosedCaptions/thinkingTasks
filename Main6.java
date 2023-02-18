package thinkingTasks;

public class Main6 {

	public static void main(String[] args) {
		float total = 0;
		for (int i = 1; i <= 1001; i++){
			if (i % 4 == 0){
				total += 0.25;
			}
			else if (i % 3 == 0){
				total += 0.1;
			}
			else if (i % 2 == 0){
				total += 0.05;
			}
			else{
				total += 0.01;
			}
		}
		System.out.printf("%.2f", total);
	}

}
