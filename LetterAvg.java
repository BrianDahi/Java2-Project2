import java.util.ArrayList;


public class LetterAvg {

	char c ;
	public LetterAvg() {
		
	}
	public LetterAvg(char c) {
		this.c = c;
	}
	
	public void numberOfStationWithLetterAvg() {
	
		PosAvg p = new PosAvg();
		try{
			p.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		ArrayList<String> tempArray = p.getArrayList();
		for(int i = 0; i < tempArray.size(); ++i) {
			System.out.println(tempArray.get(i));
		}
		System.out.println("Hello from lettavg");
	
		
		//for(int i = 0; i < newList.size(); ++i) {
		//	System.out.println(newList.get(i));
		//}
		
		
	}
	public String toString() {
		 String str = null;
		 return str;
	}
}

 
