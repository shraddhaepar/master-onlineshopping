package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public HashMap<Integer,String> addEmployee(){
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(10 ,"abc");
		hashmap.put(20 ,"xyz");
		hashmap.put(30 ,"pqr");
		return hashmap;
}
	
	

	public static void main(String[] args) {
		HashMapDemo hash = new HashMapDemo();
		System.out.println(hash.addEmployee());
		HashMap<Integer,String> hs = hash.addEmployee();
		System.out.println("second way of calling :" + hs);
		Map<Integer,String> obj = hash.addEmployee();
		System.out.println("third way of calling:"+ obj);
		

	

	}

}
