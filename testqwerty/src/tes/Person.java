package tes;

public class Person {
	private String name;
	private int age;
	private Wallet wallet;
	
	public Person(String name, int age, Wallet wallet) {
	
		this.name = name;
		this.age = age;
		this.wallet = wallet;
	}

	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", wallet=" + wallet + "]";
	}
	
}