package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashTabledemo {

	   public static void main(String[] arg) 
	    {
		   // Vectors 	// Thread safe 		// Increases capacity in 100% 	// slower
		   // ArrayList // Not Thread safe 	// Increases capacity in 50% 	// faster
		   
	        //----------hashtable ------------------------- 
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
	        ht.put(101," ajay"); 
	        ht.put(101,"Vijay"); 
	        ht.put(102,"Ravi"); 
	        ht.put(103,"Rahul");
	        ht.put(104,"Rahul");
	        ht.put(100,"Rahul");
	        System.out.println("-------------Hash table--------------"); 
	        for (Map.Entry m:ht.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
	  
	        //----------------hashmap-------------------------------- 
	        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	        
	        hm.put(104,"Amit");  // hash map allows duplicate values 
	        hm.put(101,"Vijay"); 
	        hm.put(102,"Rahul");
	        hm.put(102,"Rah_ul");
	        hm.put(100,"Amit"); 
	        
	        hm.put(105,null); 
	        System.out.println("-----------Hash map-----------"); 
	        for (Map.Entry m:hm.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        }  
	        
	        List<String> strList = new ArrayList<>();
	        strList.add("Hi");
	        strList.add("Hello");
	        strList.add(1, "ok");
	        System.out.println("\n-----------List-----------"); 
	        strList.forEach(System.out::println);
	        
	        Set<Integer> intSet = new TreeSet<>();
	        intSet.add(3);
	        intSet.add(12);
	        intSet.add(1);
	        intSet.add(4);
	        intSet.add(12);
	        
	        Set<String> strSet = new TreeSet<>();
	        strSet.add("java");
	        strSet.add("hello");
	        strSet.size();
	        
	        System.out.println("\n-----------Set int-----------"); 
	        intSet.forEach(System.out::println);
	        
	        System.out.println("\n-----------Set string-----------"); 
	        strSet.forEach(System.out::println);
	        
	        System.out.println("\n-----------List List List-----------");
	        List strList2 = new ArrayList();
	        strList2.add("ok");
	        strList2.add(2);
	        strList2.add(2.5f);
	        strList2.add(0,"load");
	        strList2.forEach(System.out::println);
	        
	        
	    } 
	
}
