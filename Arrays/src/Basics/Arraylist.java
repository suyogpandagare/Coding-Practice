package Basics;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(30);
		al.add(4);
		al.remove(2);
		
		System.out.println(al);
		
	}

}
