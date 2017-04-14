package package1;

import java.util.*;

public class Midfielder extends players{

	int passes;
	int assists;

	Midfielder (boolean check)
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

		System.out.println ("write passes");
		passes = reader.nextInt ();

		System.out.println ("write assists");
		assists = reader.nextInt ();
		
		reader.close();
	}

	void displaySpecialInfo ()
	{
		System.out.println ("passes \n" + passes);
		System.out.println ("assists \n" + assists);

		System.out.println ();
	}
	
}
