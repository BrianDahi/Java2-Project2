import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {


	String str ;


	public PosAvg() {

	}
	public PosAvg(String str) {
		// str = "OKCE";

		this.str = str;

	}


	public void showString() {
		System.out.println(str);
	}

	//method for index
	public int indexOfStation() {
		int index = 0;
		int distance = 0;
		for(int i = 0; i < fileList.size(); ++i) {
			String temp = fileList.get(i);
			for(int j = 0; j < str.length(); ++j) {
				if(str.charAt(j) != temp.charAt(j)) {
					distance ++ ;
				}

			}

			if(distance == 0) {
				return index = i + 1 ;
			}
			distance = 0;

		}	
		return 0;
	}

	public String toString() {

		String city3 = fileList.get(indexOfStation() + 1);

		String city4 = fileList.get(indexOfStation() - 3);
		String city1 = fileList.get(indexOfStation() );

		String city2 = fileList.get(indexOfStation() - 2);
		//This index is average of NOWA and OILT, NEWP and OKCE, and so on.

		return		String.format("This index is average of %s and %s, %s and %s, and so on.\n",
				city1,city2,city3,city4);
	}



	ArrayList<String> fileList = new ArrayList<String>();
	public void read(String filename) throws IOException{
		// creating object for FileReader and taking in .txt

		FileReader file = new FileReader("Mesonet.txt");
		//info stores lines from .txt
		String info;
		BufferedReader br = new BufferedReader(file);

		//info = br.readLine();
		//info = br.readLine();
		//info = br.readLine();

		String parse = "";

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
