package datastructure;

import java.util.ArrayList;
import java.util.Iterator;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		int [] jony={3,4,6,7,8,10};
		for(int i=0;i<jony.length;i++){
			System.out.println(jony[i]);
		}
		System.out.println("arraylist");
		ArrayList al = new ArrayList();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println("Size of array:  "+ al.size());
		al.remove(5);
		al.remove(4);
		al.remove(2);
		System.out.println("size of arraylist after remove:  "+ al.size());
		System.out.println(al);


		Iterator it = al.iterator();
		while (it.hasNext()){
			System.out.println(al);
		}

	}

}
