package My;

public class Application {

	public static void main(String[] args) {

		Human human = new Human("Ivan", 25);

		System.out.println(human.getAge());
		System.out.println(human.getAge());

		System.out.println(human.getName());

		System.out.println(human);
		
		Student student= new Student("Petro", 27, 1, "NTY");
		
	Student student2 =new Student(1, "LOL");
		System.out.println(student.getName());
		
		System.out.println(student.getAge());
		
		System.out.println(student.getId());
		
		System.out.println(student);
		
		System.out.println(student2);
		
		Waiter waiter =new Waiter("Oleg", 29);
		
		Waiter waiter2 =new Waiter("Volodya", 22, 2.1, 3);
		
		
		System.out.println("name "+ waiter.getName()+" age "+waiter.getAge());
		
		System.out.println(waiter2.getName());
		
		System.out.println(waiter2.getAge());
		
		System.out.println(waiter2.getHourPayRate());
		
		System.out.println(waiter2.getTips());
		
		System.out.println(waiter);
		
		System.out.println(waiter2);
		
		
	

	}

}
