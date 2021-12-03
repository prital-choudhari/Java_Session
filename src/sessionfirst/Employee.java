package sessionfirst;

public class Employee {
	String name;
	int age;
	char gender;
	double salary;
	public static void main(String[] args) {
	
		Employee e = new Employee();
		//e is referance variable 
		//new Employee is a object
		e.name="Prital";
		e.age=10;
		e.gender='F';
		e.salary=80;
		
		// object can be null also
		//e = null; //null referance 
		
		Employee e1 = new Employee();
		e1.name="Roo";
		e1.age=20;
		e1.gender='M';
		e1.salary=70;
		
		
		e=e1;
		System.out.println(e.name + " " +e.age + " "+ e.gender + " "+e.salary);
		System.out.println(e1.name + " " +e1.age + " "+ e1.gender + " "+e1.salary);
		
		
		

	}

}
