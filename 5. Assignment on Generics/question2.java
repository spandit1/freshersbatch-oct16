package Assignment5;
import java.util.HashMap;
public class question2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> map = new HashMap<>();
		
		map.put(9, 25d);
		map.put(2, 21d);
		map.put(3, 43d);
		map.put(6, 43d);
		map.put(10, 50d);
		map.put(4, 62d);
		map.put(5, 71d);
		map.put(1, 22d);
		map.put(38, 99d);
		map.put(45, 30d);
		
		System.out.println("Size of map is: "+ map.size());
		System.out.println(map);
	}
}
