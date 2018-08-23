

public class Person 

{

	private String name;
	private String age;
	private String jobTitle;
	
	
	public Person(String name, String age, String jobTitle)
	{
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		
	}
	
	public String getName()

	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAge() 
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getJobTitle() 
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)

	{
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() 
	
	{
		return name + ", " + age + ", " + jobTitle;
	}
}








	

// PeopleNames.add("Melvin");
// PeopleNames.add("Inosi");
// PeopleNames.add("Kamau");
//
// ArrayList<String> PeopleAge= new ArrayList<String>();
//
// PeopleAge.add("One");
// PeopleAge.add("Twelve");
// PeopleAge.add("Twenty");
//
// ArrayList<String> PeopleJob= new ArrayList<String>();
//
// PeopleJob.add("Big Man");
// PeopleJob.add("Queen");
// PeopleJob.add("Donny");
//
//
// ArrayList<String> People= new ArrayList<String>();
//
//
// for (int i=0;i< PeopleNames.size(); i++)
// {
// People.add(PeopleNames.get(i),PeopleAge.get(i),PeopleJob.get(i));
// System.out.println(People.get(i));
// }
// Person obj= new Person ("Melvin","Twenty","Big man");
//
// System.out.println(obj.name + " is " + obj.age + " years old and works as a "
// + obj.jobTitle);
