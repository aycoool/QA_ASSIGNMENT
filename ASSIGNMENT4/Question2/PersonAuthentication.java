public class PersonAuthentication {

	String userName;
	String password;

	public PersonAuthentication() {
	}

	public boolean AuthenticateUser()
	{
		return (userName.equals("joe") && password.equals("joepass"));
	}

	public void SetLoginCredentials( String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}

}
