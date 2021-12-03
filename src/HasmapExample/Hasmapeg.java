package HasmapExample;

import java.util.HashMap;
import java.util.Map;

public class Hasmapeg {
	
	// Hashmap is a dynamic collection which stores value in key and value format
	// Hascode could be duplicate for different keys
	
	public static void main(String[] args) {
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("Peter", "QA1");
		a.put("Prital", "Lead");
		a.put("Nia", "SDET");
		a.put(null, null);
		a.put("Nia", "QA3");
		//System.out.println(a);
		
		for(Map.Entry el : a.entrySet()) {
			System.out.println(el.getKey() + ":" + el.getValue());
		}
	}

}
