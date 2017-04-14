package package1;

import java.util.Scanner;

public class Defender extends players{

	int tackels;
	int interceptions;

	Defender (boolean check)
	{
		if (check == true)
		{
			players p = new players();
			new players(p);
			
			p.getBasicInfo ();
			getSpecialInfo ();

			//aadToDatabase ();
		}
	}

	void getSpecialInfo ()
	{
		Scanner reader = new Scanner (System.in);

		System.out.println ("write tackels");
		tackels = reader.nextInt ();

		System.out.println ("write interceptions");
		interceptions = reader.nextInt ();

		reader.close();
	}

	void displaySpecialInfo ()
	{
		System.out.println ("tackels \n" + tackels);
		System.out.println ("interceptions \n" + interceptions);

		System.out.println ();
	}
	
}
