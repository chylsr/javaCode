package homework.k1;

public class Main {

    static void addPrint(int t)
    {
        int cnt=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=i;j<=100;j++)
            {
                if(j+i<=100){
                    System.out.print(new Add(i,j)+"\t\t");
                    cnt++;
                    if(cnt==t)return;
                    if(cnt%8==0) System.out.println();
                }
            }
        }
    }

    static void subPrint(int t)
    {
        int cnt=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i-j>=0){
                    System.out.print(new Sub(i,j)+"\t\t");
                    cnt++;
                    if(cnt==t)return;
                    if(cnt%8==0) System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {

        addPrint(25);
        System.out.println();
        subPrint(25);
    }
}
