
public class LetterAvg {

	char c ;
	public LetterAvg() {
		
	}
	public LetterAvg(char c) {
		this.c = c;
	}
	public void numberOfStationWithLetterAvg() {
		PosAvg p = new PosAvg();
		for(int i = 0; i< p.fileList.size(); ++i) {
			System.out.println(p.fileList.get(i));
		}
		
		
	}
}

 
