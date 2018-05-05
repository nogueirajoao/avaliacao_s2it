package avaliacaos2;

public class Pergunta8 {

	public Integer valorDeC(Integer a, Integer b) {	
		
		Integer c = null;
		
		String aString = a.toString();
		String bString = b.toString();
		
		String cString = "";
		
		int maiorIndex;
		
		if (a > b) {
			maiorIndex = a.toString().length();
		} else {
			maiorIndex = b.toString().length();
		}
		
		for (int i = 0; i < maiorIndex; i++) {
			
			if (a.toString().length() > i) {
				cString += aString.charAt(i);
			}
			
			if (b.toString().length() > i) {
				cString += bString.charAt(i);
			}
			
		}
		
		c = Integer.parseInt(cString);
		
		if (c < 1000000) {
			return -1;
		}
		
		return c;
	}
	
}
