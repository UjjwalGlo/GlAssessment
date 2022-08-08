package Assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
	//Hash table based implementation of the Map interface.
	 static HashMap<String, String> M1 = new HashMap<>();
	 
    //This method add the country name and their capital in Hashmap
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}

	//Return the Capital of the Country passed from the map M1
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}

	//Return the Country for the Capital passed from the map M1
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> st = M1.entrySet();
		Iterator<Entry<String, String>> it = st.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> map = it.next();

			if (map.getValue().equals(capitalName))
				return map.getKey();
		}
		return null;
	}
	
    //Method swap the key an value with each other and store in the another HashMap M2
	public static HashMap<String, String> swappingValues() {
		HashMap<String, String> M2 = new HashMap<String, String>();

		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> map = it.next();
			M2.put(map.getValue(), map.getKey());
		}
		return M2;
	}
	
	//Method store the all country name (keys) in ArrayList
	public ArrayList<String> countryName() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> map = it.next();
			list.add(map.getKey());
		}	
		return list;
}
}
