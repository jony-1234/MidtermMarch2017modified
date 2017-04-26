package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityofBanaladesh = new ArrayList<>();
		cityofBanaladesh.add("Dhaka");
		cityofBanaladesh.add("Khulna");
		cityofBanaladesh.add("Rajshahi");
		List<String> cityofUSA = new ArrayList<>();
		cityofUSA.add("NY");
		cityofUSA.add("NJ");
		cityofUSA.add("FL");
		List<String> cityofUK = new ArrayList<>();
		cityofUK.add("London");
		cityofUK.add("Phone");
		cityofUK.add("car");
		Map<String, List<String>> cityList = new LinkedHashMap<String,List<String>>();
		cityList.put("Bangladesh",cityofBanaladesh);
		cityList.put("USA", cityofUSA);
		cityList.put("UK", cityofUK);
		for (Map.Entry<String,List<String>> map:cityList.entrySet()){
			List<String>cityName = map.getValue();
			System.out.println(map.getValue());
			for(String city:cityName){
				System.out.println("      "+ city);
			}
			System.out.println();


		}

	}
}





