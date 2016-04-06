package Main;

import java.util.*;

public class BeautifulString {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(sc.hasNext()){
			for(int i = 0; i < n; i++){
			//while(sc.hasNextLine()){
				int m = sc.nextInt();
				
				String s = sc.next();
				List<Character> charList = new ArrayList<Character>();
				List<Integer> countList = new ArrayList<Integer>();
				int a = 0;
				while(a < m){
					int count = 1;
					while(a+1 < m && s.charAt(a) == s.charAt(a+1)){
						a++;
						count++;
					}
					
					charList.add(s.charAt(a));
					countList.add(count);
					a++;
				}
//				System.out.println(charList);
//				System.out.println(countList);
				boolean flag = false;
				for(int j = 0; j < charList.size()-2; j++){
					if(charList.get(j)+1 == charList.get(j+1) && charList.get(j+1)+1 == charList.get(j+2)
							&& countList.get(j) >= countList.get(j+1) &&countList.get(j+1) <= countList.get(j+2)){					
							flag = true;
							break;
					}
				}
				if(flag){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
			break;
		}
		
		
	}
}
