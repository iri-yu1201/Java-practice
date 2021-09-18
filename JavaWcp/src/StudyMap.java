import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

public class StudyMap {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		//Map<String, String> map2 = new TreeMap<String, String>();
		
		//要素の追加
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		//追加済みのキーを用いると上書き
		map1.put(0, "マスカット");
		
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));	//存在しない場合nullを返す
		
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		
		System.out.println(map1.size());
		
		map1.remove(0);
		System.out.println(map1.size());
	}

}
