package Main;

import java.util.*;

public class Recruitment {
	
	public static void main (String args[]){
		// define node
		class Person{
			String sex;
			int value;
			int salary;
			public Person(String s, int a, int b){
				sex = s;
				value = a;
				salary = b;
			}
		}
		// read data
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int male = sc.nextInt();
		int female = sc.nextInt();
		int budget = sc.nextInt();
		
		List<Person> man = new ArrayList<Person>();
		List<Person> woman = new ArrayList<Person>();
		
		
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			Person t = new Person(s,a,b);
			System.out.println(s);
			if(t.sex.equals("M")){
				
			}
		}
		
		
		
	}
}
