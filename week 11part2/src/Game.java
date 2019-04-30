
public class Game {
	public static void main(String[] args) {
		Human person1 = new Human();//Creating new
		Human person2 = new Human();
		Human person3 = new Human("Mark" , 30);
		person2.age = 5;
		System.out.println("age of person2: "+person2.age); 
		System.out.println("age of person1: "+person1.age);
		System.out.println("age of person3: "+person3.age);
		
//		System.out.println(person1.hunger);
//		System.out.println("Eating command: ");
//		person1.eat();
//		
//		System.out.println("Eating command: ");
//		person1.eat();
//		person1.eat();
//		
//		System.out.println("Hunger: "+ person1.hunger);
//		System.out.println("Food: " +person1.hunger);
//		
//		System.out.println("Eating command: ");
//		person1.buyfood();
//		
//		System.out.println("Working command: ");
//		person1.work();
//		
//		System.out.println("Buying food command: ");
//		person1.buyfood();
//		
//		System.out.println("Working command: ");
//		person1.work();
//		System.out.println("Working command: ");
//		person1.work();
//		System.out.println("Eating command: ");
//		person1.eat();
//		System.out.println("Working command: ");
//		person1.work();
	}
}
