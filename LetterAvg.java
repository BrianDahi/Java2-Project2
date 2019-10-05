import java.util.ArrayList;


public class LetterAvg {

	char c ;
	public LetterAvg() {

	}
	public LetterAvg(char c) {
		this.c = c;
	}

	public int numberOfStationWithLetterAvg() {

		PosAvg p = new PosAvg();
		try{
			p.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		int counter = 0;
		ArrayList<String> tempArray = p.getArrayList();
		ArrayList<String> match = new ArrayList<String>();
		for(int i = 0; i < tempArray.size(); ++i) {

			String tempString = tempArray.get(i);

			if(c == tempString.charAt(0)) {
				++counter;
				match.add(tempString);
			}
		}

		return counter;
	}
	public String toString() {
		String str = null;
		return str;
	}
}


