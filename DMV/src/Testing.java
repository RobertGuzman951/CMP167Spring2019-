
public class Testing {
	public static void main(String[] args) {
		Person person1 = new Person("Robert",23,'m');
		Person person2 = new Person("Bob",43,'m');
		Person person3 = new Person("Sam",21,'f');
		Person person4 = new Person("Bert",25,'m');
		
		System.out.println("Expecting Can generate DL, got");
		DMV.generateDL(person1.age, true);
		System.out.println("Expecting Cannot generate DL, got");
		DMV.generateDL(person2.age, false);
		System.out.println("Expecting Can generate DL, got");
		DMV.generateDL(person3.age, true);
		System.out.println("Expecting Cannot generate DL, got");
		DMV.generateDL(person4.age, false);
		
		
	}
}
