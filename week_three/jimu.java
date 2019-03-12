package week_three;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class jimu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner( System.in);
		int t1 = 0;
		int n = cin.nextInt();
		while(t1<n)
		{
			int m =cin.nextInt(),t2=0;
			ArrayList<juxing> list = new ArrayList<juxing>();
			while(t2<m)
			{
				int a = cin.nextInt();
				int b = cin.nextInt();
				list.add(new juxing(a, b));
				t2++;
			}
			int w = cin.nextInt();
			System.out.println(adjue(list,w));
			t1++;
		}
	}

	private static int adjue(ArrayList<juxing> list, int w) {
		// TODO Auto-generated method stub
		ArrayList<juxing> tl = new ArrayList<juxing>();
		for(int i = 0;i<list.size();i++)
		{
			int sum = 0,j=i;
			juxing jx1 = list.get(i);
			while(sum<w&&j<list.size())
			{
				sum=sum+list.get(j).weight;
				j++;
			}
			if(sum>=w)
			{
			for(int m = i;m<j;m++)
			{
				if(list.get(m).weight>jx1.weight)
					jx1 =list.get(m);
			}
			tl.add(jx1);
			}
		}
		juxing jx2 = tl.get(0);
		for (juxing juxing : tl) {
			if(jx2.hight<juxing.hight)
				jx2 = juxing;
		}
		return jx2.hight+w;
	}

}
class juxing
{
	public int weight;
	public int hight;
	public juxing(int weight, int hight) {
		super();
		this.weight = weight;
		this.hight = hight;
	}
}
