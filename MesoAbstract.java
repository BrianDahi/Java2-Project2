import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-09-18
*/
public abstract class MesoAbstract 
{
	//Abstract method calAverage to return integer array.
	abstract int[] calAverage();
	abstract char letterAverage();
	ArrayList<String> meso = new ArrayList<String>();
	
	public void read(String fileName) throws IOException{
		FileReader file = new FileReader("Mesonet.txt");
		
	}


}
