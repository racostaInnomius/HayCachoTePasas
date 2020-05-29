package com.mx.cdmx.cacho;

import java.io.IOException;
import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PR {

	
	  public static void main(String[] args) {
	  
	  List<Integer> abcArr 	= new ArrayList<>(); 
	  String str 			= ""; 
	  StringBuilder strBld 	= new StringBuilder();
	  
	  abcArr.add(7); abcArr.add(6); abcArr.add(4); abcArr.add(5);
	  
	  
	  int initSize = abcArr.size();
	  
	  boolean ok = abcArr.stream().anyMatch(a -> a == 9 );
	  
	  System.out.println("anyMatch: "+ok);
	  
	  int l = 2; int r = 24;
	  
	  List<Integer> intArr 	= new ArrayList<Integer>() ; 
	  List<Integer> intArr1 = new ArrayList<Integer>() ;
	  
	  for (;l <= r;l++) {
		  intArr.add(l); 
	  }
	  
	  intArr1 = intArr.stream().filter(i -> i%2 == 1).collect(Collectors.toList());
	  System.out.println("filter: "+intArr1);
	  
	  
	  /////////////////////////////////////////
	  int[] apples = {3,2,6,2};
	  IntStream applesStream = Arrays.stream(apples);
	  applesStream.forEach(x ->{x = x * 4; System.out.println("x: " + x);});
	  // applesStream.
      // applesStream.forEach(x -> System.out.println("x1: "+ x));
	  
	  StringBuffer ok1 = new StringBuffer("");
	  
	  //abcArr = abcArr.stream().filter(s ->s.contains("Spiderman")).collect(Collectors.toList());
	  
	  Stream<Integer> abcStream 	= abcArr.stream().sorted(); 
	  Stream<Integer> abcStream1 	= abcArr.stream().sorted(); 
	  Stream<Integer> abcStreamNs 	= abcArr.parallelStream();
	  
	  
	  str = abcStream.map(Object::toString).collect(Collectors.joining());
	  abcArr.stream().sorted().forEach(strBld::append);
	  
	  System.out.println("str: 			"+str); 
	  System.out.println("strBld: 		"+strBld);
	  System.out.println("abcArr: 		"+abcArr);
	  System.out.println("abcArr.size: 	"+abcArr.size());
	  System.out.println("init.size: 	"+initSize);
	  
	  abcStreamNs.forEach(a -> {
		  System.out.println("2 a : "+ a);});
	  }
	 

	/*
	 * public static void main(String[] args) {
	 * 
	 * // nums = [2, 7, 11, 15], target = 9,
	 * 
	 * int[] nums = {2, 7, 11, 15}; int target = 18; 
	 * List<Integer> resArr = new
	 * ArrayList<>(); for (int i = 0; i <= nums.length -1; i++ ) { if (nums[i] <
	 * target) { resArr.add(i); } } System.out.println(resArr); }
	 */
	/*
	 * public static void main(String[] args) {
	 * System.out.println("class loader for HashMap: " +
	 * java.util.HashMap.class.getClassLoader());
	 * 
	 * //System.out.println("class loader for DNSNameService: " // +
	 * sun.net.spi.nameservice.dns.DNSNameService.class // .getClassLoader());
	 * 
	 * System.out.println("class loader for this class: " +
	 * PR.class.getClassLoader());
	 * 
	 * //System.out.println(com.mysql.jdbc.Blob.class.getClassLoader()); }
	 */

	
	/////////////////////////////////////////////////////
	
	/*
	 * public static void main(String args[]) { Double dobValue =
	 * ThreadLocalRandom.current().nextDouble(1, 20); String value =
	 * customFormat("##.##", dobValue); sendToFile("./output.txt", value);
	 * readFile(); }
	 * 
	 * private static void readFile() { Path path = Paths.get("./output.txt"); try {
	 * Files.lines(path).forEach(a -> { StringBuilder sb = new StringBuilder();
	 * String dlls = convert(Integer.parseInt(a.substring(0, a.lastIndexOf("."))));
	 * String cents = convert(Integer.parseInt(a.substring(a.lastIndexOf(".") + 1,
	 * a.length()))); sb.append(dlls); sb.append(" dollars "); sb.append(cents);
	 * sb.append(" cents"); sendToFile("./output1.txt", sb.toString()); });
	 * 
	 * } catch (IOException e) { e.printStackTrace(); } }
	 * 
	 * private static final String[] tensNames = { "", " ten", " twenty", " thirty",
	 * " forty", " fifty", " sixty", " seventy", " eighty", " ninety" }; final
	 * static String[] numNames = { "", " one", " two", " three", " four", " five",
	 * " six", " seven", " eight", " nine", " ten", " eleven", " twelve",
	 * " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
	 * " nineteen" };
	 * 
	 * public static String convert(int number) {
	 * 
	 * if (number == 0) { return "zero"; }
	 * 
	 * String prefix = "";
	 * 
	 * if (number < 0) { number = -number; prefix = "negative"; }
	 * 
	 * String current = "";
	 * 
	 * do { int n = number % 1000; if (n != 0) { String s =
	 * convertLessThanOneThousand(n); current = s + current; } number /= 1000; }
	 * while (number > 0);
	 * 
	 * return (prefix + current).trim(); }
	 * 
	 * private static String convertLessThanOneThousand(int number) { String
	 * current;
	 * 
	 * if (number % 100 < 20) { current = numNames[number % 100]; number /= 100; }
	 * else { current = numNames[number % 10]; number /= 10;
	 * 
	 * current = tensNames[number % 10] + current; number /= 10; } if (number == 0)
	 * return current; return numNames[number] + " hundred" + current; }
	 * 
	 * private static void sendToFile(String fileName, String line) { Path path =
	 * Paths.get(fileName); try { if (Files.notExists(path)) {
	 * Files.createFile(path); } Files.write(path, line.getBytes());
	 * 
	 * } catch (IOException e) { e.printStackTrace(); } }
	 * 
	 * static public String customFormat(String pattern, double value) {
	 * DecimalFormat myFormatter = new DecimalFormat(pattern); String output =
	 * myFormatter.format(value); return output; }
	 */
}
