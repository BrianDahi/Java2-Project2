import java.util.ArrayList;


public class LetterAvg {

	char c ;
	public LetterAvg() {

	}
	public LetterAvg(char c) {
		this.c = c;
		PosAvg p = new PosAvg();
		try{
			p.read();
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		
	}



	ArrayList<String> match = new ArrayList<String>();
	
	public int numberOfStationWithLetterAvg() {

		PosAvg p = new PosAvg();
		try{
			p.read();
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		int counter = 0;
//this temp arrayList will take the ArrayList from PosAvg
		ArrayList<String> tempArray = p.getArrayList();

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
		// .join will concat the array.
		String str = String.join("\n", match);
		return String.format("\nThey are:\n%s", str);
	}
}


