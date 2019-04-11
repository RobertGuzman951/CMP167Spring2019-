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
 public boolean hasvehicle;
 

public void eat(){
	if (food > 0) hunger--;
	else System.out.println("Not enough food");
}

public void grow(){
	age++;
}

public void work(){
	if(hunger<5)
		wealth += 10.5;
	else 
		System.out.println("Too hungery to work");
}

public void buyfood(){
	if (wealth>5) {
		wealth -= 4.5;
		food++;
	}
	else {
		System.out.println("Not enough money,get work");
	}
}
}
