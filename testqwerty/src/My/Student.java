package My;

public class Student extends Human {

	private int id;

private String nameOfUnivercity;
	
	Student(String name, int age, int id, String nameOfUnivercity) {
		super(name, age);	
		this.id = id;
		this.nameOfUnivercity = nameOfUnivercity;
	}
	
	Student (int id, String nameOfUnivercity){
		super("Vasya", 25);
		this.id = id;
		this.nameOfUnivercity = nameOfUnivercity;
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfUnivercity() {
		return nameOfUnivercity;
	}

	public void setNameOfUnivercity(String nameOfUnivercity) {
		this.nameOfUnivercity = nameOfUnivercity;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameOfUnivercity=" + nameOfUnivercity + ", name=" + getName()
				+ ", age=" + getAge() + "]";
	}
	
	
	
	
	
	

	

}
