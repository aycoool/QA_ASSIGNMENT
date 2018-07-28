public class Person {
	public String name;
	Address personAddress;

	public boolean IsPersonRob() {
		return name.equals("Rob") && IsRobsAddress();
	}

	private boolean IsRobsAddress() {
		personAddress = new Address();
		return personAddress.IsPersonAddress();
	}

	public Person() {
		name = "Rob";
	}
}