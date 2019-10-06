import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {


	String str ;
	public PosAvg() {

	}
	public PosAvg(String str) {
		this.str = str;

	}
	public int indexOfStation() {
		String temp = "";
		int index = 0;
		for(int i = 0; i < fileList.size(); ++i) {
			temp = fileList.get(i);
			if(str.equals(temp)) {
				index =fileList.indexOf(temp);
			}
		}
		return index;
		
	
	}

	public String toString() {

		String city1 = fileList.get(indexOfStation() + 1);

		String city2 = fileList.get(indexOfStation() - 1);

		String city3 = fileList.get(indexOfStation() + 2 );

		String city4 = fileList.get(indexOfStation() - 2);
		

		return	String.format("This index is average of %s and %s, %s and %s, and so on.\n",
				city2,city1,city4,city3);

	}
	ArrayList<String> fileList = new ArrayList<String>();
	public void read(String filename) throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";

		
		info = br.readLine();
		while(info != null ) {

			
			parse =  (String) info.subSequence(1,5);

			fileList.add(parse);
			info = br.readLine();
		}
		br.close();
	}
	public ArrayList<String> getArrayList() {
		
		return fileList;
	}

}
