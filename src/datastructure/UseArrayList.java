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
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("robbani");
		myList.add("jony");
		myList.add("jon");
		myList.add("jack");
		System.out.println(myList.get(1) + " is in the array list");
		System.out.println(myList.get(3) + " is in the array list");
		myList.remove("jack");

		for(String name: myList){
			System.out.println(name);
		}

		Iterator it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


	}

}