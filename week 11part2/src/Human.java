/*
 * Robert Guzman
 * 4/11/2019
 * 
 */
public class Human {
	//we have achieved encapsulation by having our instance variable private
	//then provided setters and getters to provide access
 private int age;
 private int food;
 private double wealth;
 private double hunger;
 private String  name;
 private boolean hasVehicle;
 private Vehicle[] vehicles;//array of vehicles
 
 public Human() {//Constructor new human();	
	 this.age = 0;
	 this.name = "";
	 this.wealth = 0.0;
	 this.hasVehicle = false;
	 this.food = 5;
	 this.hunger = 5.0;
	 this.vehicles = new Vehicle[100];
 }
 public Human(String name, int age) {//overloaded constructor
	 this.age = age;
	 this.name = name;
	 this.wealth = 0.0;
	 this.hasVehicle = false;
	 this.food = 5;
	 this.hunger = 5.0;
	 this.vehicles = new Vehicle[100];
 }
 //getter methods:returns value of instance variable
 public int getAge() {
	 return this.age;
 }
 public String getName() {
	 return this.name;
 }
 public double getHunger() {
	 return this.hunger;
 }
 //setter:changes the value of instance variable
 public void setAge(int age) {
	 this.age = age;
 }
 
 public void setName(String name) {
	 this.name = name;
 }
 public void setHunger(double hunger) {
	 this.hunger = hunger;
 }

 //tostring that provides a string representation of the object 
 @Override
 public String toString() {
	 return "Human: [ name: " + getName() + ", age:"+getAge()+" , wealth: "+ this.wealth+"$]";
 }
 
 
 
 public int numOfVehicles() {
	 int total = 0;
	 for (int i=0; i<vehicles.length; i++) {
		 if(vehicles[i] !=null)
			 total++;
		 else
			 break;
	 }
	 return total;
 }
 
 
 public void eat(){
	if (food >= 4.5) {
		hunger -= 1.0;
		food   -= 1;
		System.out.println("Yummy, I ate all");
	}
	
	else System.out.println("Not enough food, please buy more food");
}
public void eat(int food) {//overloaded method
	hunger -= food/4.5;
}
public void grow(){
	age++;
}

public void work(){
	if(hunger<5) {
		wealth += 10.5;
		hunger += 0.5;
		System.out.println("Whoah, I work a lot");
	}
	else 
		System.out.println("Too hungery to work");
}

public void buyfood(){
	if (wealth>5) {
		wealth -= 4.5;
		food++;
		System.out.println("I bought some food");
	}
	else {
		System.out.println("Not enough money,get work");
	}
}
}
