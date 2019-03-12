package week_three;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext())
		{
		BigInteger a = new BigInteger(cin.next());
		BigInteger b = new BigInteger(cin.next());
		System.out.println(a.add(b));
		}
//		while(cin.hasNext())
//		{
//			String s1 = cin.next();
//			String s2 = cin.next();
//			char[] ch1 = new char[s1.length()];
//			char[] ch2 = new char[s2.length()];
//			if(s1.length()<s2.length())
//			{
//				String temp = s2;
//				s2=s1;
//				s1=temp;
//			}
//			s1.getChars(0, s1.length()-1, ch1 , 0);
//			s2.getChars(0, s2.length()-1, ch2 , 0);
//			for(int i = ch1.length-1,j=ch2.length-1;j>=0;j--,i--)
//			{
//				int n1 = ch1[i] - '0';
//				int n2 = ch2[j] - '0';
//				if(n1+n2>=10)
//				{
//					ch1[i] = (char) ((n1+n2)%10);
//					ch1[i-1]=(char) ((int)ch1[i-1]+1);
//				}
//				else
//					ch1[i]=(char) (n1+n2);
//			}
//			System.out.println(new String(ch1));
//		}
	}

}
