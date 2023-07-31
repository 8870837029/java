package org.list.test;

import java.util.*;

public class Collections {

	public void sample() {

		Set<Integer> si = new LinkedHashSet<Integer>();

		// To add the value in the set
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);
		si.add(10);
		si.add(20);
		si.add(30);

		// To Print the SET Value
		System.out.println(si);

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

		// Enhanced For Loop
		for (Integer x : si) {

			System.out.println(x);
		}

	}

	public static void main(String[] args) {

		Collections c = new Collections();
		c.sample();
	}

}
