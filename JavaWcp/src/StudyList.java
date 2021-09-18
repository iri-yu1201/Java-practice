import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class StudyList {
	public static void main(String[] args) {
		//ArrayList インデックス指定で要素を取り出す、先頭からの順処理が早い
		List<String> list1 = new ArrayList<String>();	
		//LinkedList 要素の挿入、削除が早い
		//List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		list1.add("いちご");
		
		System.out.println(list1.get(0));
		
		list1.contains("りんご");
		list1.contains("なし");
		System.out.println(list1.contains("バナナ"));
		
		System.out.println(list1.size());
		
		list1.remove("バナナ");
		list1.remove("もも");
		
		list1.remove(0);
		
		for (int i = 0; i <list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
	}
}
	
