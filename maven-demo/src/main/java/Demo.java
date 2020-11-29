
public class Demo {

	public static void main(String[] args) {

		Test sample1 = new Test();

		sample1.sample(4);
		
		//int findDuplElement [] = {1,4,1,4,5,6,5,6,7,7,9,8,8,9,7,5,11};
		
		
			//Methods sample1 = new Methods();
			
			//sample1.sample(findDuplElement);
			//sample1.binaryGap(121);

	}
}

class Test {

	public void sample(int N) {

		if (N >= 1 & N <= 100) {

			for (int a = 1; a <= N; a++) {

				System.out.println("L");

				if (a == N - 1) {

					for (int b = 1; b <= N - 1; b++) {

						System.out.print("L");
					}

				}

			}
		}
		
		else System.out.println("Invalid number");
	}
}
