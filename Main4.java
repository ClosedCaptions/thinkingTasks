package thinkingTasks;

public class Main4 {

	public static void main(String[] args) {
		// Place 17 objects into the 2 circles (this is a venn diagram)
		// so that each circle has the same number of objects,
		// how many ways can you do it.
		part1();
		// what to do so the ratio is 4:3
		// looking at a venn diagram from left to right, let's label them as
		// a, b (b is the overlapping part), c
		// in short, (a + b):(b + c) = 4:3
		part2();
	}

	private static void part2() {
		for (int a = 0; a <= 17; a++){
			for (int b = 0; b <= 17; b++){
				for (int c = 0; c <= 17; c++){
					if (a + b + c == 17){
						if (b + 4 * c == 3 * a){
							// the second if statement is a simplified version of
							// (a + b) : (b + c) = 4 : 3
							System.out.println("Ratio 4:3 - " + a + ", " + b + ", " + c);
						}
					}
				}
			}
		}
	}

	private static void part1() {
		int count = 0;
		for (int a = 0; a <= 17; a++){
			for (int b = 0; b <= 17; b++){
				// b is the overlapping part in the venn diagram
				// a is the non-overlapping parts (if that makes sense)
				if (2 * a + b == 17){
					count++;
				}
			}
		}
		System.out.println("The number of ways is " + count);
	}

}
