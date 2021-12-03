package SuperKeyword;

public class College extends University{

	String name = "Indira College";
	
	public void ColgDept() {
		super.UniBranch();
		super.Location();
		System.out.println("CollegeName -" +super.name);
	}
	
	public void Location() {
		System.out.println("University -- location");
		super.name();
	}
	
	public College() {
		super();
		//super(10); it is not allowed to have multiple super keyword in single constructor
		System.out.println("College -- default constructor");
		//super(); it should be always 1st statement in constructor
	}
}
