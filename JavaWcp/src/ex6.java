//関数型インターフェース…実装すべき抽象メソッドがひとつしかない

public class ex6 {
	@FunctionalInterface //明示的にする
	public interface A{
		public String hello();
	}
	public interface B{
		public String hello();
		public String goodbye();
	}
	@FunctionalInterface
	public interface C{
		public String hello();
		public static String hi() {
			return "Hi!";
		}
	}
	//A,Cは抽象メソッドがひとつなので関数型インターフェース
}
