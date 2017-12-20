package cs;

public class MinMaxNumber {

	public static void main(String[] args) {
		int num[] = new int[10];
		// Random Integer Number
		System.out.println("Before Sort");
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random()*100);
			System.out.print(num[i] + " ");			
		}
		int max = num[0];
		int index = 0;
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				index = i;
			}
		}
		System.out.println("\nThe Maximum Number is " + max);
		System.out.println("Index of Maximum Number is " + index);
	}

}
