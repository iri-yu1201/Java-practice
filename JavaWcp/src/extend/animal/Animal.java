package extend.animal;

public abstract class Animal {
	//protectedはサブクラスもアクセス可能
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	//abstract 抽象
	public abstract void cry();
}
