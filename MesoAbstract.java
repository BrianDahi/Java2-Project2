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


	String [] stringArray = new String[4];
	private int capacity = 4;

	public void read(String filename) throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);

		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		String parse = "";
		int i= 0;
		info = br.readLine();
		while(info != null ) {

			if(i == capacity) {
				expandArray();
				capacity++;
			}



			// trying to break up string in mesonet.txt
			parse =  (String) info.subSequence(4,8);


			stringArray[i] = parse;

			i++;
			info = br.readLine();
		}

		//This closes bufferReader
		br.close();
	}


	public void expandArray(){

		String[] temp = new String[stringArray.length + 1];
		System.arraycopy(stringArray, 0, temp, 0, stringArray.length);
		stringArray = temp;
	}

}
