package Main;

import java.util.*;

public class sub {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int i = 0; i < t; i++){
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            int[] a = new int[n];
	            for(int j = 0; j < n; j++){
	            	a[j] = sc.nextInt();
	            }
	            max(n,m,a);
	        }
	 }
	 public static void max(int n, int m, int[] a){
		 int max = 0;
		 if (m >= n){
			 System.out.println(100);
			 return;
		 }
		 for(int i = 0; i < a.length-m-1; i++){
			max = Math.max(max, a[i+m+1] - a[i] - 1);
		 }
		 max = Math.max(max, a[m] - 1);
		 max = Math.max(max, 100 - a[n-1-m]);
		 System.out.println(max);
	 }
}
