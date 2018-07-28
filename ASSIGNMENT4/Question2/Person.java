public class Person
{
	private String name;

	private PersonAuthentication personAuthentication = new PersonAuthentication();
	private PersonTelephoneNumber personTelephoneNumber = new PersonTelephoneNumber();
	public Person(String name)
	{
		this.name = name;
	}

	public void SetAreaCode(String areaCode)
	{
		this.personTelephoneNumber.areaCode = areaCode;
	}
	public String GetAreaCode()
	{
		return personTelephoneNumber.areaCode;
	}
	public void SetPhoneNumber(String phoneNumber)
	{
		this.personTelephoneNumber.phoneNumber = phoneNumber;
	}

	public String GetPhoneNumber()
	{
		return personTelephoneNumber.GetPhoneNumber();
	}

	
	public void SetLoginCredentials(String userName, String password)
	{
		this.personAuthentication.SetLoginCredentials(userName, password);
	}

	public boolean AuthenticateUser()
	{
		return personAuthentication.AuthenticateUser();
	}
}