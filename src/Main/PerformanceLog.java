package Main;

import java.util.*;

public class PerformanceLog {
	
	public static void main (String args[]){
		class log{
			String name;
			String time;
			String action;
			public log(String a, String b, String c){
				name = a;
				time = b;
				action = c;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean stop = false;
		log[] tep = new log[n];
		Stack<log> stack = new Stack<log>();
		List<String> res = new ArrayList<String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		for(int i = 0; i < n; i++){
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			tep[i] = new log(a,b,c);
			
			//System.out.println(compareTime(tep[i].time,tep[i-1].time));
			if (i > 0 && !compareTime(tep[i].time,tep[i-1].time)){
				stop = true;
				break;
			}
			if(tep[i].action.equals("START") ){
				stack.push(tep[i]);
				res.add(tep[i].name);
				hm.put(tep[i].name, tep[i].time);
			}else{
				if(stack.size() == 0){
					stop = true;
					break;
				}
				log t = stack.pop();
				if(!t.name.equals(tep[i].name)){
					stop = true;
					break;
				}
				String set = setTime(tep[i].time, t.time);
				hm.put(tep[i].name,set);
				//String k = res.get(res.indexOf(tep[i].name)) + " " + set;
				
			}
		}
		if(!stack.isEmpty()){
			stop = true;
		}
		
		// output the final result
		if(stop){
			System.out.println("Incorrect performance log");
		}else{
			for(String p:res){
				System.out.println(p+" "+hm.get(p));
			}
		}
		
	}
	public static boolean compareTime(String a, String b){
		String[] x = a.split(":");
		String[] y = b.split(":");
		boolean flag = false;
		for(int i = 0; i < x.length; i++){
			if(Integer.valueOf(x[i]) > Integer.valueOf(y[i])){
				flag = true;
			}else if(!flag && Integer.valueOf(x[i]) < Integer.valueOf(y[i])){
				return false;
			}
		}
		return true;
	}
	public static String setTime(String a, String b){
		String[] x = a.split(":");
		String[] y = b.split(":");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < x.length; i++){
			sb.append(Integer.valueOf(x[i]) - Integer.valueOf(y[i]));
			if(i < x.length-1){
				sb.append(":");
			}
			
		}
		return sb.toString();
	}
}
