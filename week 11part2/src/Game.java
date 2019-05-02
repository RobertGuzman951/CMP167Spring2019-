import java.util.Random;

public class Game {
	public static void main(String[] args) {
		Human person1 = new Human();//Creating new
		Human person2 = new Human();
		Human person3 = new Human("Mark" , 30);
		
		person1.setName("Rick");
		person1.setAge(65);
		person1.eat();
		person1.work();
		
		person2.setName("Jimmy");
		person2.setAge(15);
		person2.eat();
		person2.work();
		
		person3.setName("Sam");
		person3.setAge(19);
		person3.eat();
		person3.work();
		
		System.out.println("age of person1: "+person1.getAge());
		System.out.println("age of person2: "+person2.getAge()); 
		System.out.println("age of person3: "+person3.getAge());
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		int rand = (int)(Math.random()*20)+10;
		System.out.println(rand);
		
		Random rn = new Random();
		int n = rn.nextInt(45);
		
		
		
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
