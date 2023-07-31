package org.base;
import java.awt.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Student {
public static void main(String[] args) {
	Set a = new HashSet();
	a.add("dk");
	a.add(98556358555l);
	a.add(20);
	a.add('g');
	System.out.println(a);
	
	int size = a.size();
	System.out.println(size);
	
	a.remove("dk");
	System.out.println(a);
	
	a.removeAll(a);
	System.out.println(a);
	
	Set b = new LinkedHashSet();
	b.add("Kumar");
	b.add(98.65355f);
	b.add(15);
	b.add('f');
	System.out.println(b);
	
	a.addAll(a);
	System.out.println(a);
	
	Set c = new TreeSet();
	c.add("dhanush");
	c.add("8870837029");
	c.add("12");
	c.add("g");
	System.out.println(c);
	
	
	
	
	
		 
	
	
}
}
