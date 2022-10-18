package collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> mh = new ArrayList<String>();
		mh.add("Mumbai");
		mh.add("Nashik");
		mh.add("Pune");
		ArrayList<String> karnataka = new ArrayList<String>();
		karnataka.add("mysore");
		karnataka.add("banglor");
		karnataka.add("uti");
		ArrayList<String> madhyapradesh = new ArrayList<String>();
		madhyapradesh.add("bhopal"); 
		madhyapradesh.add("lakhanau");
		madhyapradesh.add("bhusaval");
		
		HashMap<String ,ArrayList<String>> hmstate = new HashMap<String ,ArrayList<String>>();
		hmstate.put("MH", mh);
		hmstate.put("KAR",karnataka);
		hmstate.put("MADHY",madhyapradesh);
		HashMap<String,HashMap<String ,ArrayList<String>>> hmcountry = new HashMap<String,HashMap<String ,ArrayList<String>>>();
		hmcountry.put("India", hmstate);
		Set<String> setof = hmcountry.keySet();
		for( String str : setof) {
			System.out.println(str);
			System.out.println(hmcountry.get(str));
		}





		
	}

}
