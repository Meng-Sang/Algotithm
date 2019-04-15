public class week_eight_F {
    public  static int [] [] Array = new int [8] [8] ;
    public static void main(String[] args) {
        findQueen(0);
    }
    public  static  void findQueen(int i)
    {
        if(i>7)
        {
            print();
            return;
        }
        for(int m=0;m<8;m++)
        {
            if(check(i,m))
            {
                Array[i][m] = 1;
                findQueen(i+1);
                Array[i][m]=0;
            }
        }
    }
    public  static boolean check(int k,int j)
    {
        for(int i=0;i<8;i++)
        {
            if(Array[i][j]==1)
                return false;
        }
        for(int i=k-1,m=j-1;i>=0&&m>=0;i--,m--)
        {
            if(Array[i][m]==1)
            {
                return false;
            }
        }
        for(int i=k-1,m=j+1;i>=0&&m<=7;i--,m++)
        {
            if(Array[i][m]==1)
                return false;
        }
        return true;
    }
    public static void print()
    {
        for(int i=0;i<8;i++)
        {
            for(int j = 0;j<8;j++)
            {
                if(Array[i][j]==1)
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
