package com.collection;

import java.util.*;


class Student{
	int roll;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// list1 can only store String Object
		ArrayList<String> list1 = new ArrayList<String>();
		
		// list1 can store any type Object
		ArrayList list2 = new ArrayList();
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "ruu";
		
		
		//1. Add Data in List
		list1.add("rudzani");
		list1.add("trevor");
		list1.add("matshotshi");
		
		
		list2.add("madilonga");
		list2.add(10);
		list2.add(true);
		list2.add(2.2);
		list2.add(s1);
		
		// Print reference to list shall print elements in the list the way in sequence
		System.out.println("list 1 is : " +list1);
		System.out.println("list 2 is : " +list2);
		
		// 2 Get the element from List
		String name = list1.get(2);
		System.out.println("name is "+ name);
		
		Object o = list2.get(2);
		System.out.println("o is "+ o);
		
		// update Element in list
		list1.set(2, "madondo");
		System.out.println("new list is " + list1);
		
		// remove element from list
		list1.remove(2);
		System.out.println("list1 after remove 2 " + list1);
		
		//list.clear(); -> remove all
		
		if(list1.contains("rudzani")) {
			System.out.println("rudzani is in the list");
		}
		
		// Iterate in ArrayList
		System.out.println("===Iterating with Enhanced for Loop==");
		for(String str: list1) {
			System.out.println(str);
		}
		
		System.out.println("=================end==================");

		System.out.println("=========Iterating with Iterator======");
		
		Iterator<String> itr = list1.iterator();
		
		while( itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}

}
