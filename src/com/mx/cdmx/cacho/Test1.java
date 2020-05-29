package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test1 {

	/*
	public static void main(String[]args) {
		boolean res = reverse("ab");
		System.out.println(res);
	}*/
	
    public static void main(String[] args) 
    { 
        // Creatinga an ArrayList without any type specified 
        List<String> al = new ArrayList<>(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        //al.add(10); // Compiler allows this 
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
  
        // Causes Runtime Exception 
        String s3 = (String)al.get(2); 
    } 
	
	/*
	public static void main(String args[]) 
    { 
		String arr[] = { "0","1","0" };
		String arr1[] = { "0","1","0" };
		
		Arrays.stream(arr).parallel().filter(a -> a.equals("1")).count();
		
		List<String> listStr;
		Arrays.stream(arr).parallel().forEach(a -> {
			//listStr = Arrays.stream(arr1).parallel().map(a1 -> a.equals("1")).collect(Collectors.toList());
		});
		
		//System.out.println("i: "+i);
    }*/
	
	/*
	public static void main(String args[]) 
    { 
        // Creating object of class linked list 
        LinkedList<String> object = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println("Linked list : " + object); 
  
        // Removing elements from the linked list 
        object.remove("B"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        // Finding elements in the linked list 
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
        // Number of elements in the linked list 
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Y"); 
        System.out.println("Linked list after change : " + object); 
    } 
	*/
	
	/*
	public static void main(String[]args) {
		HashMap<Integer,Integer> mapMap			= new HashMap<>();
		List<HashMap<Integer,Integer>> mappList = new ArrayList<>();
		
		mapMap.put(1,0);
		mapMap.put(2,0);
		
		//mappList.add(mapMap);
		
		getValue(2, mapMap);
		putValue(5, mapMap);
		
		System.out.println("mapMap: "+mapMap);
	}*/

	private static void putValue(int i, HashMap<Integer, Integer> mapMap) {
		Iterator<Entry<Integer, Integer>> iter = mapMap.entrySet().iterator();
		
		while (iter.hasNext()) {
			Entry<Integer, Integer> next = iter.next();
			int k = next.getKey();
			int v = next.getValue();
			
			Entry<Integer, Integer> next1 = iter.next();
			int k1 = next1.getKey();
			int v1 = next1.getValue();
			
			if (v < v1) {
				mapMap.remove(k);
			} else {
				mapMap.remove(k1);
			}
			mapMap.put(i,0);
		}
	}

	private static void getValue(int i, HashMap<Integer, Integer> mapMap) {
		if (mapMap.containsKey(i)) {
			int t = mapMap.get(i) + 1;
			mapMap.put(i,t);
		}
	}
	
	private static boolean reverse(String string) {
		
		String compare = "";
		
		List<Object> strArr = Arrays.asList(string.toCharArray());
		
		int i = string.toCharArray().length - 1;
		StringBuffer a = new StringBuffer();
		for (; 0 < i; i--) { 
			a.append(strArr.get(i));
			string.equalsIgnoreCase(a.toString());
			//if its true 
			//break return
		}
		System.out.println("a: "+a);
		
		return true;
	}
	
}
