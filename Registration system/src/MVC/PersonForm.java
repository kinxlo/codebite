package MVC;

public class PersonForm {
	
	private static int count = 0;
	
	private int id;
	private String name;
	private String occupation;
	private String age;
	private String EmploymentStatus;
	private String country;
	private String taxid;
	private String gender;
	public PersonForm(String name, String occupation, String age, String employmentStatus,
			String country, String taxid, String gender) {

		this.id = count++;
		
		this.name = name;
		this.occupation = occupation;
		this.age = age;
		EmploymentStatus = employmentStatus;
		this.country = country;
		this.taxid = taxid;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmploymentStatus() {
		return EmploymentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		EmploymentStatus = employmentStatus;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTaxid() {
		return taxid;
	}
	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PersonForm [id=" + id + ", name=" + name + ", occupation=" + occupation + ", age=" + age
				+ ", EmploymentStatus=" + EmploymentStatus + ", country=" + country + ", taxid=" + taxid + ", gender="
				+ gender + "]";
	}
	
	
	
}
