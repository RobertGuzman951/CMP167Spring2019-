
public class Vehicle {
public String color;
public char brand;
public int wheels;


public Vehicle() {//Constructor new vehicle();	
	 this.wheels = 0;
	 this.color = "";
	 
}

public void wheels(){
	if (wheels >= 2) {
		System.out.println("The vehicle can run");
	}
	else System.out.println("The vehicle can not run");
}

public void color() {
	System.out.println("Enter vehicle color: ");
}

public void brand() {
	System.out.println("Enter brand of vehicle: ");
}

}
