import java.util.Scanner;

public class week_eight_D {
    static int arr [] ;
    static boolean book[];
    static int n;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext())
        {
            n = cin.nextInt();
            arr = new int[n+1];
            book = new boolean[n+1];
            dsf(1);
        }
    }

    private static void dsf(int i) {
        if(i>n) {
            for(int j=1;j<=n;j++)
                System.out.print(arr[j]);
            System.out.println();
            return;
        }
        for(int j=1;j<=n;j++)
        {
            if(book[j]==false)
            {
                book[j]=true;
                arr[i]=j;
                dsf(i+1);
                book[j]=false;
            }
        }
    }
}
