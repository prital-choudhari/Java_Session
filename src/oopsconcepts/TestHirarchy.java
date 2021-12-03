package oopsconcepts;

public class TestHirarchy {
	
	//method overriding is run time polymorphism 
	//when we have method in child and paren class with same name, same number of parameter, same return type

	public static void main(String[] args) {
		Univercities un = new Univercities();
		un.location(); // Call immediate class member
		un.aictename();
		un.MnLocation();
		Univercities.department();
		un.univercityLocation();
		
		
		AICTE a = new AICTE();
		a.location();
		//a.MumbaiUniversity(); Parent can not take any property from child (a is object ref of AICTE and its trying to access property of university)
		
		//Top/up casting
		AICTE ai = new Univercities(); //Child class object can be refreed by parent class ref variable
		ai.location();
		ai.aictename();
		//ai.MnLocation(); //this is called Ref type check which means parent class object ref variable can not access child class member
		
		MainUni mu = new Univercities();
		mu.univercity();
		mu.univercityLocation();
		
		
		
		//Down casting is not allowed at the run time in java and it will throw ClassCastException
	
		//Univercities u = (Univercities) new AICTE();
		//u.location();
	}

}
