package com.exercise18linkedlist.app;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;
public class LinkedListApp {
	public static void main(String[] args) {
		final int ELEMENTS = 100;
		LinkedList <Byte> myList = new LinkedList<Byte>();
		ArrayList<Short> myArray = new ArrayList<Short>();
		Stack<Integer> myBattery = new Stack<Integer>();
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
		HashMap<Integer, String> myDictionary = new HashMap<Integer,String>();
		
		Random randomNumbers = new Random(System.nanoTime());
		
		myList.add((byte) 5);
		myList.add((byte) 10);
		myList.add((byte) 20);
		myList.add((byte) 30);
		myList.add((byte) 40);
		System.out.println(myList);
		myList.set(0,(byte) 2);
		System.out.println(myList);
		System.out.println("Remove "+myList.remove());
		System.out.println("Remove "+myList.remove());
		System.out.println(myList);
		System.out.println(myList.size());
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains((byte)20));
		
		for (int i=0;i<ELEMENTS;i++) {
			myList.add((byte) randomNumbers.nextInt(100));
		}
		System.out.println(myList);
		Iterator myIterator = myList.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		for(Byte myNumber : myList) {
			System.out.println(myNumber);
		}
		System.out.println("-- ArrayList --");
		myArray.add((short) 5);
		myArray.add((short) 10);
		myArray.add((short) 15);
		myArray.add((short) 20);
		myArray.set(0, (short)2);
		System.out.println(myArray);
		System.out.println("get: "+myArray.get(2));
		System.out.println("remove: "+myArray.remove(2));
		System.out.println(myArray);
		myIterator = myArray.iterator();
		System.out.println("While");
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		System.out.println("-- For --");
		for(Short myShort : myArray) {
			System.out.println(myShort);
		}
		
	} 

}
