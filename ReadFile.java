import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

	//String [] stringArray = new String[4];
	//private int capacity = 4;

	ArrayList<String> fileList = new ArrayList<String>();
	public void read(String filename) throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);

		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
		//info = br.readLine();
		//info = br.readLine();
		//info = br.readLine();
		String parse = "";
		int i= 0;
		info = br.readLine();
		while(info != null ) {

			/*if(i == capacity) {
				expandArray();
				capacity++;
			}*/
			


			// trying to break up string in mesonet.txt
			parse =  (String) info.subSequence(1,5);

			fileList.add(parse);
			//stringArray[i] = parse;

			//i++;
			info = br.readLine();
		}

		//This closes bufferReader
		br.close();
	}

	/*public void expandArray(){

		String[] temp = new String[stringArray.length + 1];
		System.arraycopy(stringArray, 0, temp, 0, stringArray.length);
		stringArray = temp;
	}*/
	public void displayFile() {
		/*for(int i = 0; i < stringArray.length ; ++i) {
			System.out.println(stringArray[i]);
		}*/
		System.out.println("this is arrayList");
		for(int i = 0 ; i < fileList.size() ; ++i) {
			System.out.println(fileList.get(i));
		}
	}

}
