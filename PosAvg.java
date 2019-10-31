import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {


	
	String str;
	public PosAvg() {

	}
	public PosAvg(String str) {
		this.str = str;
		

		try{
			read();
		}
		catch(Exception e) {
			System.out.println("wrong in PosAvg");
		}

		
	}

	
//Int this method we are searching for the index of the given String from the Driver

	public int indexOfStation() {
		String temp = "";
		int index = 0;

		for(int i = 0; i < fileList.size(); ++i) {
			temp = fileList.get(i);
			if(str.equals(temp)) {
				index =fileList.indexOf(temp);
				
			}
		}
		return index + 1;
	}
//The toString method needs to return in the format of a few averages 

	public String toString() {
		
		int privateIndex = indexOfStation();
		
		String city1 = fileList.get(privateIndex );
		
		String city2 = fileList.get(privateIndex - 2);

		String city3 = fileList.get(privateIndex + 1);

		String city4 = fileList.get(privateIndex - 3);
		
		return	String.format("This index is average of %s and %s, %s and %s, and so on.",
			city2,city1,city4,city3);
	}

	ArrayList<String> fileList = new ArrayList<String>();

	public void read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		
		info = br.readLine();
		info = br.readLine();
		info = br.readLine();
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
