/*Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
[
Delhi India
Tokyo Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.*/


package Assessment;

import java.util.HashMap;

public class Question1{

	public static void main(String[] args) {
		
		//Create an object of Country Class
		Country data=new Country();
		
		//Store the key and values in HashMap with the use of function(saveCountryCapital()) and Object(data)
		data.saveCountryCapital("China", "Beijing");
		data.saveCountryCapital("India", "Delhi");
		data.saveCountryCapital("South Africa", "Cape Town");
		
		//Print the Capital of Country with the use of function(getCapital()) and Object(data)
		System.out.println("Capital of South Africa is: "+data.getCapital("South Africa"));
		
		//Print the Country of capital with the use of function(getCountry()) and Object(data)
		System.out.println("Country of Delhi is: "+data.getCountry("Delhi"));
		
		//Print the All Country name with the use of function(getCapital()) and Object(data)
		System.out.println("All Country Name:"+data.countryName());
		
		//Print all Swap data stored in a HashMap M2
		HashMap<String, String> M2 = Country.swappingValues();
		System.out.println("Swapped Data :"+M2);

	}

}
