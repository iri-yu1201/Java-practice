import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket<E extends Fruit> {
	
	private E elem;
	private final BigDecimal basketPrice = new BigDecimal(100);
	Basket(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です。");
	}
	
	void printTotalPrice() {
		BigDecimal totalPrice = basketPrice.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った籠の合計は" + totalPrice + "円です。");
	}
	
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}
}

class Apple extends Fruit {	
	Apple(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return name;
	}
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
}

class Peach extends Fruit {
	
	Peach(String name, BigDecimal price){
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return name;
	}
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
}
