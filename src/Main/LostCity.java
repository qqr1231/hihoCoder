package Main;

import java.util.*;

public class LostCity {
	public static void main(String args[]){
		class pair {
			int x;
			int y;
			public pair(int a, int b){
				this.x = a;
				this.y = b;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] map = new char[n][m];
		for(int i = 0; i < n; i++){
			String s = sc.next();
			map[i] = s.toCharArray();
		}
		char[][] location = new char[3][3];
		for(int i = 0; i < 3; i++){
			String s = sc.next();
			location[i] = s.toCharArray();
		}
		Queue<pair> res = new LinkedList<>();
		int row = map.length;
		int col = map[0].length;
		
		char[][] t1 = new char[3][3];
		char[][] t2 = new char[3][3];
		char[][] t3 = new char[3][3];
		char[][] t4 = new char[3][3];
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				t1[i][j] = location[i][j];
				t2[j][2-i] = location[i][j];
				t3[2-i][2-j] = location[i][j];
				t4[2-j][i] = location[i][j];
			}
		}
				
		for(int i = 0; i < row - 2; i++){
			for(int j = 0; j < col -2 ; j++){
				if(twoArray(map,i,j,t1) || twoArray(map,i,j,t2) ||twoArray(map,i,j,t3) || twoArray(map,i,j,t4)){
					res.offer(new pair(i+2,j+2));
				}
			}
		}
		
		while(!res.isEmpty()){
			pair p = res.poll();
			System.out.println(p.x + " " + p.y);
		}
		
	}

	public static boolean twoArray(char[][] a, int row, int col, char[][]b){

		if (b[1][1] != a[row+1][col+1])  
            return false;  
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(a[row+i][col+j] != b[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}
