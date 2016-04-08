package nekiString;

import java.util.ArrayList;

public class Metode {
	
	/**Vraca duzinu datog stringa*/
	public int duzinaStringa(String str){
		int brojac = str.length();
		
		return brojac;
	}
	
	/**Vraca parne karaktere u datom stringu*/
	public ArrayList<String> parniKarakteri(String str){
	
		ArrayList<String> list = new ArrayList<>();
		for(int i = 1; i < str.length(); i+= 2){
			String a = Character.toString(str.charAt(i));
			list.add(a);
		}
		
		return list;
	}
	
	/**Vraca neparne karaktere u datom stringu*/
	public ArrayList<String> neparniKarakteri(String str){
		
		return null;
	}
	
	/**vraca velika slova u datom stringu*/
	public int velikaSlova(String str){
		
		return 0;
	}
	
	/**Mala slova u datom stringu*/
	public int malaSlova(String str){
		
		return 0;
	}
	
	/**Vraca karaktere u datom stringu koji nisu slova*/
	public ArrayList<String> neSlova(String str){
		
		return null;
	}

}