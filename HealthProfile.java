public class HealthProfile{
	
	private String firstName;
	private String lastName;
	private String gender;
	private String monthOfBirth;
	private int dayOfBirth; 
	private int yearOfBirth;
	private double height;
	private double weight;
	
	public HealthProfile( String firstName, String lastName, String gender, String monthOfBirth, int dayOfBirth, int yearOfBirth, double height, double weight ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.height = height;
		this.weight = weight;
		
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setMonthOfBirth(String monthOfBirth){
		this.monthOfBirth = monthOfBirth;
	}
	public String getMonthOfBirth(){
		return monthOfBirth;
	}
	
	public void setDayOfBirth(int dayOfBirth){
		this.dayOfBirth = dayOfBirth;
	}
	public int getDayOfBirth(){
		return dayOfBirth;
	}

	public void setYearOfBirth (int yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}
	public int getYearOfBirth(){
		return yearOfBirth;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	public  double getHeight(){
		return height;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	
	public int getAge(){
		int age;
		age = 2023 - yearOfBirth;
		return age;
	}
	
	public double getMaximumHeartRate(){
		double maximumHeartRate;
		maximumHeartRate = 220 - getAge();
		return maximumHeartRate;
	}
	
	public double getTargettedHeartRate(){
		double targettedHeartRate;
		targettedHeartRate = (double) (0.85 * getMaximumHeartRate());
		return targettedHeartRate;
	}
	
	public double getBodyMassIndex(){
		double bodyMassIndex;
		bodyMassIndex = (double)(weight / (height * height));
		return bodyMassIndex;
	}


}
