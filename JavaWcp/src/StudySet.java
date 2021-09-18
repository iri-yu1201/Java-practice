import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

//Set 重複せず、順番の保証がない要素を保持
//要素を取り出すには繰り返し処理を用いる

public class StudySet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		//Set<String> set2 = new LinkedHashSet<String>();
		
		set1.add("スイカ");
		set1.add("メロン");
		set1.add("いちご");
		
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
		
		System.out.println(set1.size());
		
		set1.remove("メロン");
		
		
		//拡張for
		for (String fruit : set1) {
			System.out.println(fruit);
		}
	}

}
