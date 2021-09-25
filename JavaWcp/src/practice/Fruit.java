package practice;
//ストリーム処理
import java.util.ArrayList;
import java.util.List;

public class Fruit {
	//名前
	public String name;
	//在庫数
	public int quantity;
	
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}
	
	@Override
	public String toString() {
		return name + ": " + quantity + "個";
	}


public static void main(String[] args) {
		
	List<Fruit> fruits = new ArrayList<>();
	fruits.add(new Fruit("りんご", 7));
	fruits.add(new Fruit("みかん", 15));
	fruits.add(new Fruit("いちご", 4));
	fruits.add(new Fruit("メロン", 8));
	fruits.add(new Fruit("ぶどう", 20));
	
	List<Fruit> filtered = new ArrayList<>();
	//拡張forでfruitsをループ
	for (Fruit fruit : fruits) {
		if (fruit.quantity <= 10) {
			filtered.add(fruit);
			//条件のものだけをリストに追加
		}
	}
	//20個ずつ追加する
	List<Fruit> ordered = new ArrayList<>();
	for (Fruit fruit : filtered) {
		ordered.add(fruit.order(20));
	}
	ordered.sort(new Comparator<Fruit>() {
		@Override
		public int compare(Fruit f1, Fruit f2){
			return f1.quantity - f2.quantity;
		}
	});
	
	for (Fruit fruit: ordered) {
		System.out.println(fruit);
	}
}	//ラムダ式
//	fruits.stream() //stream生成
//		.filter(f -> f.quantity <= 10) //中間操作1: 個数が10以下のものを抽出
//		.map(f -> f.order(20)) //2: 20個ずつ発注
//		.sorted((f1, f2) -> f1.quantity - f2.quantity) //3: 個数の少ない順に並び替え
//		.forEach(System.out.println); //終盤操作: 標準出力

