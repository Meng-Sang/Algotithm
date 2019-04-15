import java.util.Scanner;

public class week_eight_B {
    static int [] arr = new int[11];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = 1;
        for(int i=1;i<=10;i++)
            arr[i]=t=t*i;
        int n = cin.nextInt();
        while(n-->0)
        {
            int temp = cin.nextInt();
            for(int i=10;i>=0;i--)
                if(temp>=arr[i])
                    temp = temp - arr[i];
            if(temp==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
