public class HeartRate {

	private String firstName;
	private String lastName;
	private String monthOfBirth;
	private int dayOfBirth;
	private int yearOfBirth;
	
	public HeartRate(String firstName, String lastName, String monthOfBirth, int dayOfBirth, int yearOfBirth){
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.monthOfBirth = monthOfBirth;
	this.dayOfBirth = dayOfBirth;
	this.yearOfBirth = yearOfBirth;

	}
	
	public void setFirstName (String firstOfName){
		this.firstName = firstName;
	}
	public String getFirstName (){
		return firstName;
	}
	
	public void setLastName (String LastOfName){
		this.lastName = lastName;
	}
	public String getLastName (){
		return lastName;
	}
	
	public void setMonthOfBirth(String monthOfBirth){
		this.monthOfBirth = monthOfBirth;
	}
	public String getMonthOfBirth (){
		return monthOfBirth;
	}
	
	public void setDayOfBirth(int dayOfBirth){
		this.dayOfBirth = dayOfBirth;
	}
	public int getDayOfBirth (){
		return dayOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}
	public int getYearOfBirth (){
		return yearOfBirth;
	}
	
	public int getAge(){
		int age;
		age = 2023 - yearOfBirth;
		return age;
	}
	
	public int getMaximumHeartRate(){
		int maximumHeartRate;
		maximumHeartRate = 220 - getAge();
		return maximumHeartRate;
	}
	
	public double getTargettedHeartRate(){
		double targettedHeartRate;
		targettedHeartRate = (double) (0.85 * getMaximumHeartRate());
		return targettedHeartRate; 
	}
	
	
	
}
