/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-09-18
*/
import java.io.IOException;

public class Driver 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("hello");
		//String stID = "OKCE";
		/*PosAvg  readFile = new PosAvg(stID);
		try{
			readFile.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		
		
		
		readFile.showString();
		
		System.out.println(readFile.indexOfStation());
		//readFile.displayFile();*/
		
		
		
		
		String stID = "OKCE";
		
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		
		
		PosAvg posAvg = new PosAvg(stID);
		
		try{
			posAvg.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		
		
		
		System.out.println("The Index of the city is: " + posAvg.indexOfStation());
		System.out.println(posAvg);
		System.out.print("\n");
		
		System.out.println("Ascii Ceiling is " + mesoInherit.calAverage()[0]);
		System.out.println("Ascii Floor is " + mesoInherit.calAverage()[1]);
		System.out.println("Ascii Average is " + mesoInherit.calAverage()[2]);
		System.out.print("\n");
		
		System.out.println("Letter Avg: " + mesoInherit.letterAverage());
		System.out.print("\n");
		
		LetterAvg letterAvg = new LetterAvg(mesoInherit.letterAverage());
		//letterAvg.numberOfStationWithLetterAvg();
		
		System.out.println("Total number of stations starting with letter '" + mesoInherit.letterAverage() + "' is " + letterAvg.numberOfStationWithLetterAvg() + ".");
		
		//System.out.print(letterAvg);*/
	}
}