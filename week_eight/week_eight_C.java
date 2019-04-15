import java.util.Arrays;
import java.util.Scanner;

public class week_eight_C {
    static  int [] arr ;
    static boolean [] book;
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext())
        {
            int n = cin.nextInt();
            arr = new int[n];
            book = new boolean[n];
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                arr[i] = cin.nextInt();
                sum+=arr[i];
            }
            if(sum%2!=0) {
                System.out.println("Sorry,I can't!");
                continue;
            }
            int temp = sum/2;
            dfs(temp,0,n);
            if(flag==true)
                System.out.println("Of course,I can!");
            else
                System.out.println("Sorry,I can't!");
            flag=false;
        }
    }

    private static void dfs(int temp,int i,int n) {
        if(flag==true)
            return;
        if(n==i)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                if(book[j]==true)
                sum+=arr[j];
            }
            if(sum==temp)
                flag = true;
            return;
        }
        book[i]=true;
        dfs(temp,i+1,n);
        book[i]=false;
        dfs(temp,i+1,n);
    }
}
