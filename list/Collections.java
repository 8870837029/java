package org.list.test;

import java.util.*;

public class Collections {

	public void sample() {

		

		// Convert List to Set to avoid duplicates
		List<Integer> li = new LinkedList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);
		li.add(20);
		li.add(30);

		Set<Integer> si1 = new TreeSet<Integer>();
		si1.addAll(li);
		System.out.println(si1);

		for (Integer x : si) {

			//System.out.println(x);
		}

	}

	public static void main(String[] args) {

		Collections c = new Collections();
		c.sample();
	}

}
