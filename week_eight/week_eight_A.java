public class week_eight_A {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++)
            for(int j=0;j<=33;j++)
            {
                int k = 100-i-j;
                if(k%3==0&&5*i+3*j+k/3==100)
                    System.out.println(String.format("cock=%d,hen=%d,chicken=%d",i,j,k));
            }
    }
}
