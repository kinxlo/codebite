package MVC;

public enum Age {
	Under_16("Child"),
	_to_85("Adult"),
	Over_85("Senior");
	
	private final String string;
	
	Age(String string){
		this.string = string;
	}

	@Override
	public String toString() {
		return string;
	}
	
	
}

