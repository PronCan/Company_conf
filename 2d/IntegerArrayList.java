import java.io.IOException;
import java.util.*;

public class IntegerArrayList {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);

		for (Integer i : list) {
			System.out.println(i);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
