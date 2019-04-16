/*
 * Robert Guzman
 * 4/11/2019
 * 
 */
public class Human {
 public int age;
 public int food;
 public double wealth;
 public double hunger;
 public String  name;
 public boolean hasVehicle;
 public Vehicle[] vehicles;//array of vehicles
 
 public Human() {//Constructor new human();	
	 this.age = 0;
	 this.name = "";
	 this.wealth = 0.0;
	 this.hasVehicle = false;
	 this.food = 5;
	 this.hunger = 5.0;
	 this.vehicles = new Vehicle[100];
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
