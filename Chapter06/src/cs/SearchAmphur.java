package cs;

import javax.swing.JOptionPane;

public class SearchAmphur {

	public static void main(String[] args) {
		int count = 0;
		String amphur[] = {"เมืองอุบลราชธานี", "วารินชำราบ", "เขื่องใน", "พิบูลมังสาหาร", "สำโรง", "ดอนมดแดง", 
				"ตระการพืชผล"};
		System.out.println("Size of array : " + amphur.length);
		String search = JOptionPane.showInputDialog("กรอกอำเภอในจังหวัดอุบลราชธานีที่ต้องการค้นหา : ");
		System.out.println("search : " + search);
		for(int i=0; i<amphur.length; i++) {
			if(search.equals(amphur[i])) {				
				count++;
				break;
			}
		}
		if(count == 1) {
			JOptionPane.showMessageDialog(null, "ยินดีด้วยมีอำเภอที่คุณค้นหา");
		}else {
			JOptionPane.showMessageDialog(null, "เสียใจด้วยไม่มีอำเภอที่คุณค้นหา");
		}
	}

}
