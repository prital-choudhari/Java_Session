package SuperKeyword;

public class Department extends Management{
	
	String name;
	int count;
	String location;
	
	public Department() {
		super();
		System.out.println("Department -- Default constructor");
	}
	
	public Department(String name, int count) {
		this.name=name;
		this.count=count;
		
	}
	
	public Department(String name,String location, int count) {
		this.name="name";
		this.count=count;
		this.location="location";
		
		System.out.println(name+" "+count+" "+location);
		
	}

	public void dispaly() {
		this.name="Computer";
		this.count=10;
		this.location="Bang";
		System.out.println(name+" "+count+" "+location);
	}
	
	
	
	@Override
	public void staff() {
		System.out.println("Dept -- staff");
		
	}

	@Override
	public void student() {
		System.out.println("Dept -- student");
		
	}
	
}
