package week_tow;

import java.time.temporal.JulianFields;
import java.util.Scanner;

public class stairways {

//	private static final long mod = 998244353;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner cin = new Scanner(System.in);
//		int n = cin.nextInt(),flag=0;
//		while(flag<n)
//		{
//			long m =cin.nextLong();
//			long sum = g(m)%mod;
//			System.out.println(sum);
//			flag++;	
//		}
//	}
//	private static long g(long m)
//	{
//		if(m>0)
//		{
//		if(m==1)
//		{
//			return 1;
//		}
//		if(m==2)
//		{
//			return 2;
//		}
//		if(m==3)
//		{
//			return 4;
//		}
//		if(m>3)
//		{
//			return g(m-1)+g(m-2)+g(m-3);
//		}
//		}
//		return 0;
//	}
//	private static void f(int n) {
//		// TODO Auto-generated method stub
//		int a[] = new int[n+1];
//		int j ;
//		for(j = 2;j<=n;j++)
//		{
//			if(j==2)
//			{
//				a[j] = 1;
//			}
//			if(j==3)
//			{
//				a[j] = 2;
//			}
//			if(j>3)
//			{
//				a[j] = a[j-1]+a[j-2];
//			}
//		}
//		System.out.println(a[n]);
//	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a=cin.nextInt();
		int []f=new int[a];
		for(int i=0;i<a;i++) {
			f[i]=cin.nextInt();
		}
		for (int i = 0; i < a; i++) {
			long sum=count(f[i]);
			System.out.println(sum);
		}
		cin.close();
	}
    private static long count(int n) {
    	long count=0;
    	int mod=998244353;
    	long a=1;
    	long b=2;
    	long c=4;
        if (n == 1) return 1;
       if (n == 2) return 2;
        if (n == 3) return 4;
       for(int i=4;i<=n;i++) {
    	   count=(a+b+c)%mod;
    	   a=b%mod;
    	   b=c%mod;
    	   c=count%mod;
    	 
       }
       return count;
    }

}
