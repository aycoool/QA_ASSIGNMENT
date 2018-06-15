package myquestion6;

import java.io.FileReader;
import java.util.Scanner;

public class MYLoadCurrency {
	
	public void Load()
	{
		PiggyBank mm = new PiggyBank();
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
			mm.numPennies = Integer.parseInt(in.next());
			mm.numDimes = Integer.parseInt(in.next());
			mm.numNickels = Integer.parseInt(in.next());
			mm.numQuarters = Integer.parseInt(in.next());
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

}
