package Main;

import java.util.*;

public class deal {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			substitute(s);
		  //System.out.println(s);
		}
//		String s = sc.nextLine();
//		substitute(s);
//		sc.close();
	}
	public static void substitute(String s){
		//s = s.toLowerCase();
		String t = "marshtomp";
		String r = "fjxmlhx";
		for(int i = 0; i < s.length()-8; i++){
			String  k = s.substring(i, i+9);
			if(k.toLowerCase().equals(t)){
				s = s.substring(0,i)+r+s.substring(i+9); 
			}
		}
		System.out.println(s);
	}
	
	
}
