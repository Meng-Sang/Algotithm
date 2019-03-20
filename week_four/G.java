package week_four;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		List<Integer> list = L();
//		Set<Integer> set = S(list);
//		int n = cin.nextInt();
//		while(n>0)
//		{
//			int m = cin.nextInt();
//			if(set.contains(m))
//				System.out.println("Yes");
//			else
//				System.out.println("No");
//			n--;
//		}
		int n = cin.nextInt();
		while(n>0)
		{
			int m = cin.nextInt();
			if(is(m,list))
				System.out.println("Yes");
			else
				System.out.println("No");
			n--;
		}
		cin.close();
	}

private static boolean is(int m, List<Integer> list) {
		// TODO Auto-generated method stub
	for (int i = list.size()-1; i > 0; i--) {
		if(m==0)
			break;
		if(m>=list.get(i))
			m = m-list.get(i);
	}
	if(m==0)
		return true;
	else
		return false;
}

//	private static Set<Integer> S(List<Integer> list) {
//		// TODO Auto-generated method stub
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i=0;i<list.size()-1;i++)
//		{
//			for(int j=0;j<list.size()-i;j++)
//			{
//				int temp = 0;
//				for(int t=j;t<=j+i;t++)
//				{
//					temp=list.get(t)+temp;
//				}
//				set.add(temp);
//			}
//		}
//		return set;
//	}

	private static List<Integer> L() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(0); 
		int t = 1;
		for(int i=1;i<10;i++)
		{
			t=t*i;
			list.add(t);
		}
		return list;
	}

}
