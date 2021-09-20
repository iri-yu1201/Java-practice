//正確な計算が必要な際に使う、変更不可能な、任意精度の符号付き10進数
import java.math.BigDecimal;
//抽象クラスの宣言
abstract class Fruit {
	String name;
	BigDecimal price;
	
	Fruit(String name, BigDecimal price){
		this.name = name;
		this.price = price;
	}
	
	abstract protected String getName();
	abstract protected BigDecimal getPrice();
	
	
}
