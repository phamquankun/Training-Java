package main;
import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void printString() {
		System.out.println("hehehe");
	}
    public static void main(String[] args) {
    	List<String> listString = new ArrayList<String>();    	
    	
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        
        for (int i = 0; i < listString.size(); i++) {
        	if (i%2 == 0) {
                System.out.println(listString.get(i));
                printString();
        	}
        }
        List<Float> listFloat = new ArrayList<Float>(1000);
        
        listFloat.add((float) 1);
        listFloat.add((float) 19);
        
		int tong = 0;
        for (int i = 0; i < listFloat.size(); i++) {
        		tong=(int) (tong + listFloat.get(i));
        }
        System.out.println(tong);
        
    }   
}
