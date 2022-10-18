package collection;
import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Employee,Employee> hm = new HashMap<Employee,Employee>();
		Employee emp = new Employee();
		hm.put(emp,emp);
		System.out.println(hm.get(emp));
		

	}

}
