import java.util.Arrays;

public interface Comparator {
	public static void main(String[] arfs) {
	List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
	
	Collections.sort(
		numbers,
		(Integer x, Integer y) -> {
			return Integer.compare(x, y);
		});
	System.out.println(numbers);
	}
}
