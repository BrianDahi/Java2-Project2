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
		//indexOfStation();

		try{
			read();
		}
		catch(Exception e) {
			System.out.println("wrong in PosAvg");
		}

	}

	private int privateIndex;

	public int indexOfStation() {
		String temp = "";
		int index = 1;

		for(int i = 0; i < fileList.size(); ++i) {
			temp = fileList.get(i);
			if(str.equals(temp)) {
				index =fileList.indexOf(temp);
				//System.out.println(index);
				privateIndex = index ;
				return index + 1;
			}
		}
		return index;
	}

	public String toString() {

		/*String city1 = fileList.get(privateIndex + 1);

		String city2 = fileList.get(privateIndex - 1);

		String city3 = fileList.get(privateIndex + 2 );

		String city4 = fileList.get(privateIndex - 2);*/
		
		return String.format("This index is average of %s and %s, %s and %s, and so on.",
				indexAvg()[1],indexAvg()[0],indexAvg()[3],indexAvg()[2]);
	
		//return	String.format("This index is average of %s and %s, %s and %s, and so on.",
		//		city2,city1,city4,city3);
	}//This index is average of OILT and OKEM, NRMN and OKMU, and so on.
	public String[] indexAvg() {
		String[] indexAvg = new String [4];
		String temp;
		temp = fileList.get(privateIndex + 1);
		indexAvg[0] = temp;
		temp = fileList.get(privateIndex - 1);
		indexAvg[1] = temp;
		temp = fileList.get(privateIndex + 2);
		indexAvg[2] = temp;
		temp = fileList.get(privateIndex - 2);
		indexAvg[3] = temp;
		return indexAvg;
	}
	ArrayList<String> fileList = new ArrayList<String>();

	public void read() throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);
		String parse = "";
		//since mesonet doesnt start at zero I added a space.

		//fileList.add("zero");

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
