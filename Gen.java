//package tmp;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class Gen {

	public Vector<Integer> vgen(int vl, int vr) {
		Random rand = new Random();
		Vector<Integer> vint = new Vector<Integer>();
		for (int i = 0; i < vl; i++) {
			vint.addElement(rand.nextInt(vr));
		}
		return vint;
	}
	
	public void vout(Vector<Integer> v) {
		for (Iterator<Integer> iterator = v.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		Gen g = new Gen();
		Vector<Integer> vint2;
		vint2 = g.vgen(5, 5);
		g.vout(vint2);
		
		Arr.testHi(Arr.arr);
		Arr.testHi(Arr.arr2);
		
		Search s = new Search();
		System.out.println("Len = " + s.len + " Mid = " + s.half);
		
		s.search(Arr.arr, 5); 
	}
	
}
