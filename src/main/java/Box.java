import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	private List<T> arry = new ArrayList<>();
	
	public void add(T elem) {
		this.arry.add(elem);
	}

	public void print() {
		this.arry.iterator().forEachRemaining((obj) -> System.out.print(obj)); 
	}
}