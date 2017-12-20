package cs;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class BinarySearch {

	public static void main(String[] args) {
		int num[] = new int[10];
		// Random Integer Number
		System.out.println("Before Sort");
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random()*100);
			System.out.print(num[i] + " ");			
		}
		Arrays.sort(num);
		System.out.println("\nAfter Sort");
		for(int i=0; i<num.length; i++) {			
			System.out.print(num[i] + " ");			
		}
		int search = Integer.parseInt(JOptionPane.showInputDialog("ป้อนตัวเลขที่ต้องการค้นหา : "));
//		System.out.println("\nsearch : " + search);
		int low=0, high=9, mid, index=-1;
		mid = (int) Math.ceil((low + high)/2.0);
//		System.out.println("Mid : " + mid);
		while(low<=high && index==-1) {
			mid = (int) Math.ceil((low + high)/2.0);
			if(search == num[mid]) {
				index = mid;break;
			}else if(search < num[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		if(index!=-1) {
			JOptionPane.showMessageDialog(null, "มีข้อมูลที่ต้องการค้นหา");
		}else {
			JOptionPane.showMessageDialog(null, "ไม่มีข้อมูลที่ต้องการค้นหา");
		}
	}

}
