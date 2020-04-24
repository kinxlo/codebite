package MVC;

public enum EmploymentStatus {
	Employed("Employed"),
	UnEmployed("Self-Employed"),
	SelfEmployed("Un-Employed");
	
	private final String display;
	
	EmploymentStatus(String name){
		display = name;
	}

	@Override
	public String toString() {
		return display;
	}
	
	
	
}
