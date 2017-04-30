package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
			LinkedList<String> list = new LinkedList<>();
			Scanner input = new Scanner(System.in);
			System.out.println("How many state name do you want to insert:   ");
			int numberofinput = input.nextInt();
			Scanner sc = new Scanner(System.in);


			for (int i=0; i<numberofinput; i++){
				System.out.println("please enter state name:    ");
				String statename = sc.nextLine();
				list.add(statename);



			}
			Iterator it = list.iterator();
			while (it.hasNext()){
				System.out.println(it.next());
			}

		}
	}



