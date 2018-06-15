package myquestion6;

import java.io.PrintWriter;

public class MYSaveCurrency {
	
	PiggyBank nn = new PiggyBank();
	public void Save()
		{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(nn.numPennies));
			writer.println(Integer.toString(nn.numDimes));
			writer.println(Integer.toString(nn.numNickels));
			writer.println(Integer.toString(nn.numQuarters));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}
	

}
