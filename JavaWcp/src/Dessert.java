public enum Dessert {
	APPLE(100) {
		@Override
		void advertise() {
			System.out.println("真っ赤なリンゴが" + getPrice() + "円！");
		}
	}, 
	ICE_CREAM(200) {
		@Override
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
		}
	}, 
	CAKE(300) {
		@Override
		void advertise() {
			System.out.println("みんな大好き甘いケーキが" + getPrice() + "円！");
		}
	},
	;
	
	private int price;
	
	private Dessert(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//abstract修飾子 抽象メソッドのある抽象クラスに付与が必要
	abstract void advertise();
	
	public static void main(String[] args) {
		Dessert apple = Dessert.APPLE;
		Dessert iceCream = Dessert.ICE_CREAM;
		
		System.out.println(apple);
		System.out.println(iceCream);
		
		printDessertName(Dessert.APPLE); //呼び出し
		
		//新しいインスタンスの生成不可
		
		// ==で比較できる
		Dessert x = Dessert.APPLE;
		Dessert y = Dessert.APPLE;
		
		System.out.println(x == y); //trueを返す
		System.out.println(x.equals(y));
		
		//name()メソッド = 列挙した定数名をString型で返す
		System.out.println(Dessert.APPLE.name());
		
		//ordinal()メソッド = int型で列挙を返す
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
		
		System.out.println(Dessert.APPLE.getPrice());
		Dessert.ICE_CREAM.advertise();
		System.out.println(Dessert.CAKE.getPrice());
		
		
	}
		
	static void printDessertName(Dessert dessert) {
		System.out.println(dessert);
		
		Dessert cake = Dessert.valueOf("CAKE");
		System.out.println(cake);
			
		
	}
}