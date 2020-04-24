package MVC;

public enum Gender {
	Male("Male"),
	Female("female");
	
	private final String string;
	
	Gender(String string){
		this.string = string;
	}
	
	@Override
	public String toString(){
		return string;
	}
}
