public class Person {

	private String name, jobTitle;
	private int age;
	private boolean alive;
	                                                                                                                               
	public Person(String name, int age, String jobTitle, boolean alive) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.alive = alive;
	}
	
	@Override
	public String toString() {
		return String.valueOf(alive);
	}
	
	


}
