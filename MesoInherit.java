
public class MesoInherit extends MesoAbstract{

	String str;
	public MesoInherit() {
		
	}
	
	public MesoInherit(MesoStation mesoStation) {
		str = mesoStation.getStID();
		
	}
	
	int[] calAverage() {

		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		char d = str.charAt(3);
		
		/*int numa = (int)a;
		int numb = (int)b;
		int numc = (int)c;
		int numd = (int)d;*/
		double num = (a + b + c + d)/4.0;
		double ceiling = Math.ceil(num);
		double floor = Math.floor(num);
		double avg = Math.round(num);
		
		int ceilingInt = (int)ceiling;
		int floorInt = (int)floor;
		int avgInt = (int)avg;
		
		int[] intArray = new int[2] ;
		
		
		
		return new int [1];
		
		
		
}

	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

