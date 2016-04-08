package nekiString;

import java.util.ArrayList;

public class Metode {
	
	public int duzinaStringa(String str){
		int brojac = str.length();
		
		return brojac;
	}
	
	public ArrayList<String> parniKarakteri(String str){
	
		ArrayList<String> list = new ArrayList<>();
		for(int i = 1; i < str.length(); i+= 2){
			String a = Character.toString(str.charAt(i));
			list.add(a);
		}
		return list;
	}
	
	public ArrayList<String> neparniKarakteri(String str){
		
		return null;
	}
	
	public int velikaSlova(String str){
		
		return 0;
	}
	
	public int malaSlova(String str){
		
		return 0;
	}
	
	public ArrayList<String> neSlova(String str){
		
		return null;
	}

}