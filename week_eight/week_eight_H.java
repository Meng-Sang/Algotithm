import java.util.Scanner;

public class week_eight_H {
    static int [] [] arr ;
    static int n,m;
    static int x []  = {1,-1,0,0};
    static int y [] =  {0,0,1,-1};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0)
        {
            int count = 0;
            n = cin.nextInt();
            m = cin.nextInt();
            arr = new int[n+1][m+1];
            for(int i=1;i<=n;i++)
                for(int j=1;j<=m;j++)
                    arr[i][j] = cin.nextInt();
            for(int i=1;i<=n;i++)
                for (int j = 1; j <= m; j++)
                    if (arr[i][j] == 1) {
                        dsf(i, j);
                        count++;
                    }
            System.out.println(count);
        }
    }

    private static void dsf(int p,int q) {
        arr[p][q]=0;
        for(int i=0;i<4;i++)
            if(p+y[i]>=1&&p+y[i]<=n&&q+x[i]>=1&&q+x[i]<=m&&arr[p+y[i]][q+x[i]]==1)
                dsf(p+y[i],q+x[i]);
    }
}
