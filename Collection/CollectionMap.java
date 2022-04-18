package main;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMap {
	public static void main(String[] args) {
		Map<String, String> mapCity = new TreeMap<>();
	    mapCity.put("QNg", "Quảng Ngãi");
	    mapCity.put("QN", "Quảng Nam");

	    mapCity.put("QN", "Quảng Ninh");
	    mapCity.put("HCM", "Thành phố Hồ Chí Minh");
	         
	    System.out.println("Danh sách các thành phố trong mapCity: ");
	    Set<Map.Entry<String, String>> setCity = mapCity.entrySet();
	    System.out.println(setCity);
	    
	    if (mapCity.containsValue("Thành phố Hồ Chí Minh")) {
	        System.out.println("Có Thành phố Hồ Chí Minh trong mapCity");
	    }
	    
	    System.out.println("HCM: " + mapCity.get("HCM"));
	}
}
