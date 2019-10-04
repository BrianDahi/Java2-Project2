import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	// Constructors
	String str;



	public PosAvg() {

	}
	public PosAvg(String str) {
		// str = "OKCE";
		this.str = str;
	}
	

	//method for index
	public int indexOfStation() {
		//
		int index = 0;
		return index;
	}



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
		
		String parse = "";
		int i= 0;
		info = br.readLine();
		while(info != null ) {

			// trying to break up string in mesonet.txt
			parse =  (String) info.subSequence(1,5);

			fileList.add(parse);
			info = br.readLine();
		}
		br.close();
	}
	public void displayFile() {
	
		System.out.println("this is arrayList");
		for(int i = 0 ; i < fileList.size() ; ++i) {
			System.out.println(fileList.get(i));
		}
	}
}
