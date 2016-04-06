package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            reduce(s);
        }
    }
    
    public static void reduce(String s){
        if(s == null || s.length() < 2){
            System.out.println(0);
            return;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            String t = s.substring(0,i) + s.charAt(i) + s.substring(i,s.length());
           // System.out.println(t);
            t = cut(t);
            //System.out.println("-"+t);
            int dif = s.length() - t.length() + 1;
            max = Math.max(dif, max);
        }
        System.out.println(max);
    }
    public static String cut(String t){
        StringBuilder sb = new StringBuilder();
        String test = "1";
        while(!test.equals(t)){
        	test = sb.toString();
        	sb = new StringBuilder();
        	int j = 0; int i = 1;
            for(; i < t.length(); i++){
            	if(t.charAt(i) != t.charAt(i-1)){
            		sb.append(t.charAt(j));
            		j++;
            	}else{
            		while(i < t.length() &&t.charAt(i) == t.charAt(i-1)){
            			i++;        			
            		}
            		j = i;
            	}     
            }
            if(j != t.length()){
            	sb.append(t.charAt(j));
            }
            t = sb.toString();
            //System.out.println("+"+t);
            if(sb.length() == 1)	break;          
        }
        
        t = sb.toString();
        
        return sb.toString();
    }
    
    
}