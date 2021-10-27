package thinkingTasks;

public class Main1 {

	public static void main(String[] args) {
//		Question prompt: How many 6 digit numbers are there whose digits sum to 51?
//		Mathematical solution: Permutation
//		😎The CS Solution:
		int count = 0;
		for (int a = 1; a <= 9; a++){
			for (int b = 1; b <= 9; b++){
				for (int c = 1; c <= 9; c++){
					for (int d = 1; d <= 9; d++){
						for (int e = 1; e <= 9; e++){
							for (int f = 1; f <= 9; f++){
								if (a + b + c + d + e + f == 51){
									count++;
									String str = "" + a + b + c + d + e + f;
									System.out.println(str);
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Result:" + count);
		// can i upload this to github :D
	}

}
