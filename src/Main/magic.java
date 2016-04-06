package Main;

import java.util.*;

public class magic {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			sc.nextLine();
			String s = sc.next();
			
			output(x,y,z,s);
		
		
	}
	public static void output(int x, int y, int z, String s){
		System.out.println(s);
		int red = 0;
		int yel = 0;
		int blue = 0;
		int pot = 0;
		int max = 0;
		
		int[] res  = new int[3];
		res[0] = x;
		res[1] = y;
		res[2] = z;
		Arrays.sort(res);
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'R')	red++;
			if(s.charAt(i) == 'Y')	yel++;
			if(s.charAt(i) == 'B')	blue++;
			
			int[] arr = new int[3];
			arr[0] = Math.abs(red - yel);
			arr[1] = Math.abs(yel - blue);
			arr[2] = Math.abs(blue - red);
			Arrays.sort(arr);
			if(res[0] == arr[0] && res[1] == arr[1] && res[2] == arr[2]){
				max = Math.max(max,i - pot+1);
				pot = i+1;
				red = 0;
				blue = 0;
				yel = 0;
			}
			//System.out.println(red + yel + blue);
		}
		max = Math.max(max, s.length() - pot);
		System.out.println(max);
	}
}
