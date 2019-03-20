package week_four;

import java.util.*;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
			String str = cin.nextLine();
			outPut(str);
		}
		cin.close();
	}

	private static void outPut(String str) {
		// TODO Auto-generated method stub
		String [] strs = str.split(" ");
		Map<String, Integer> map = new TreeMap<String,Integer>();
		for (String s : strs) {
			if(!map.containsKey(s))
				map.put(s, 1);
			else
				map.put(s, map.get(s)+1);
		}
		System.out.println(strs.length);
		Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(s+":"+map.get(s));
		}
	}

}
