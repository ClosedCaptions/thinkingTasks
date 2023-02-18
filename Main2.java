package thinkingTasks;

public class Main2 {

	public static void main(String[] args) {
		int result = 0;
		result += twos();
		result += threes();
		result += fours();
		result += fives();
		result += sixes();
		result += sevens();
		result += eights();
		System.out.println("Overall count is: " + result);
	}

	private static int eights() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					for (int d = c; d < 105; d++){
						for (int e = d; e < 105; e++){
							for (int f = e; f < 105; f++){
								for (int g = f; g < 105; g++){
									for (int h = g; h < 105; h++){
										if ((h - g == g - f) && (g - f == f - e) && (f - e == e - d) && (e - d == d - c) && (d - c == c - b) && (c - b == b - a)){
											if ((a + b + c + d + e + f + g + h) == 105){
												System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("The count for eights is: " + count);
		return count;
	}

	private static int sevens() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					for (int d = c; d < 105; d++){
						for (int e = d; e < 105; e++){
							for (int f = e; f < 105; f++){
								for (int g = f; g < 105; g++){
									if ((g - f == f - e) && (f - e == e - d) && (e - d == d - c) && (d - c == c - b) && (c - b == b - a)){
										if ((a + b + c + d + e + f + g) == 105){
//											System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("The count for sevens is: " + count);
		return count;
	}

	private static int sixes() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					for (int d = c; d < 105; d++){
						for (int e = d; e < 105; e++){
							for (int f = e; f < 105; f++){
								if ((f - e == e - d) && (e - d == d - c) && (d - c == c - b) && (c - b == b - a)){
									if ((a + b + c + d + e + f) == 105){
										System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
										count++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("The count for sixes is: " + count);
		return count;
	}

	private static int fives() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					for (int d = c; d < 105; d++){
						for (int e = d; e < 105; e++){
							if ((e - d == d - c) && (d - c == c - b) && (c - b == b - a) && (a + b + c + d + e == 105)){
//								System.out.println(a + " " + b + " " + c + " " + d + " " + e);
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println("The count for fives is: " + count);
		return count;
	}

	private static int fours() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					for (int d = c; d < 105; d++){
						if ((d - c == c - b) && (c - b == b - a) && (a + b + c + d == 105)){
//							System.out.println(a + " " + b + " " + c + " " + d);
							count++;
						}
					}
				}
			}
		}
		System.out.println("The count for fours is: " + count);
		return count;
	}

	private static int twos() {
		int count = 0;
		for (int a = 0; a < 105; a++){
			for (int b = a; b < 105; b++){
				if (a + b == 105){
					count++;
//					System.out.println(a + " " + b);
				}
			}
		}
		System.out.println("The count for twos is: " + count);
		return count;
	}

	private static int threes() {
		int count = 0;
		for (int a = 0; a < 105; a ++){
			for (int b = a; b < 105; b++){
				for (int c = b; c < 105; c++){
					if (c - b == b - a && (a + b + c == 105)){
//						System.out.println(a + " " + b + " " + c);
						count++;
					}
				}
			}
		}
		System.out.println("The count for threes is: " + count);
		return count;
	}

}
