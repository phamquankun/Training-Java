package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionSet {

	public static void main(String[] args) {
	    List<Integer> listInteger = new ArrayList<>();
	    Set<Integer> setInteger = new HashSet<>();
	         

	    listInteger.add(0);
	    listInteger.add(3);
	    listInteger.add(1);
	    listInteger.add(4);
	    listInteger.add(2);
	    listInteger.add(8);
	         
	    setInteger = listInteger.stream().filter(number -> number % 2 == 0)
	        .collect(Collectors.toSet());
	         
	    System.out.println("Các phần tử trong setInteger: "+setInteger);
	}
}
