import java.util.Scanner;
public class week_eight_G {
    static int n , m ;
    static int arr [];
    static boolean book [] ;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext())
        {
            n = cin.nextInt();
            m = cin.nextInt();
            arr = new int[m+1];
            arr[0] = Integer.MAX_VALUE;
            book = new boolean[n+1];
            dsf(1);
        }
    }
    private static void dsf(int i) {
        if(i>m) {
            if(print())
            {
                for(int k=1;k<=m;k++)
                    System.out.print(arr[k]);
            System.out.println();
            }
            return;
        }
        for(int j=n;j>=1;j--)
            if(book[j]==false)
            {
                book[j]=true;
                arr[i]=j;
                dsf(i+1);
                book[j]=false;
            }
    }
    static boolean print()
    {
        for(int i=1;i<=m;i++)
            if(arr[i]>=arr[i-1])
                return false;
            return true;
    }
}
