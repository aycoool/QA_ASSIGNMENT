package myquestion3;

import java.util.ArrayList;

public class MySndRprtToEmail {
	private ArrayList<String> reportData;
	public void SendToEmail(String emailAddress)
	{
		try
		{
	    	StringBuilder builder = new StringBuilder();
	    	for (int i = 0; i < reportData.size(); i++)
	    	{
	    		builder.append(reportData.get(i) + "\n");
	    	}
	    	EmailSender sender = new EmailSender();
	    	sender.SendEmail(emailAddress, "Profit Report!", builder.toString());
		}
		catch (Exception e)
		{
			System.out.println("Yipes internet must be down!");
		}
	}
}
