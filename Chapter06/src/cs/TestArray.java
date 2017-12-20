package cs;

public class TestArray {

	public static void main(String[] args) {
		int score[],x;
		int []a,b;
		score = new int[10];		
		b = new int[10];
		a = new int[10];
		x = 10;
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
//		score[5] = 60;
//		score[6] = 70;
//		score[7] = 80;
//		score[8] = 90;
//		score[9] = 100;
		for(int i=0; i<10; i++) {
			score[i] = 10*(i+1);
			System.out.println("score[" + i + "] : " + score[i]);
		}
//		System.out.println("score[0] : " + score[0]);
//		System.out.println("score[1] : " + score[1]);
//		System.out.println("score[2] : " + score[2]);
//		System.out.println("score[3] : " + score[3]);
//		System.out.println("score[4] : " + score[4]);
//		System.out.println("score[5] : " + score[5]);
//		System.out.println("score[6] : " + score[6]);
//		System.out.println("score[7] : " + score[7]);
//		System.out.println("score[8] : " + score[8]);
//		System.out.println("score[9] : " + score[9]);
		a = score;
		b = a;
		a[5] = 200;
		System.out.println("score[5] : " + b[5]);
	}

}
