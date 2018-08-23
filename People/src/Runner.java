import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<>();

		Person p1 = new Person("Melvin", "One", "Big Man");
		// System.out.println(people.getName());
		Person p2 = new Person("Inosi", "tweleve", "Queen");
		// System.out.println(p2.getName());
		Person p3 = new Person("Kenny", "Twenty", "Donny");
		// System.out.println(p3.getName());

		people.add(p1);

		people.add(p2);

		people.add(p3);

		for (Person aPerson : people) {
			System.out.println(aPerson.getName());

		}
	}
}
