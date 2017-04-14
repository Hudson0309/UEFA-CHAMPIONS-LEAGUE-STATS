package package1;

import java.util.*;

public class Forward extends players{

	int shots;
	int assists;

	Forward (boolean check)
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

		System.out.println ("write shots");
		shots = reader.nextInt ();

		System.out.println ("write assists");
		assists = reader.nextInt ();

		reader.close();
	}

	void displaySpecialInfo ()
	{
		System.out.println ("shots \n" + shots);
		System.out.println ("assists \n" + assists);

		System.out.println ();
	}

	//void changeInDatabase (Forward F)
	
}
