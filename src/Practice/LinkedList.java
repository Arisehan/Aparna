package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList {
	public static void main(String[]args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(5);
	list.add(2);
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	}
}
