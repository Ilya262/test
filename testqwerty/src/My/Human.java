package My;

public class Human {

	private String name;
	private int age;

	public Human(String name, int age) {

		this.name = name;
		this.age = age;
	}

	//if constructor default exist. daughter class not must have super fields and super constructor 
	

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

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
