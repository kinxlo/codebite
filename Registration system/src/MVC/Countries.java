package MVC;

public enum Countries {
	NJ("Nigeria"),
	US("United State"),
	UK("United Kingdom");
	
	private final String string;
	
	Countries(String string){
		this.string = string;
	}
	
	@Override
	public String toString(){
		return string;
	}
}
