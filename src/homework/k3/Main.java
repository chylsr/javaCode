package homework.k3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static HashSet<Ss> set=new HashSet<>();

    public static Ss getAdd(int a, int b)
    {
        return new Add(a,b);
    }

    public static Ss getSub(int a, int b)
    {
        return new Sub(a,b);
    }


    public static Res check(String a, String f, String b) {
       Res res=new Res(0,null);
       if(f.length()!=1 || (f.charAt(0) != '-' && f.charAt(0) != '+'))
       {
           res.id=1;
//           System.out.println("##########");
           return res;
       }
       try {
           int x = Integer.parseInt(a);
           int y = Integer.parseInt(b);
           char c=f.charAt(0);
           if(c=='-')
           {
               if(x-y<0){
                   res.id=2;
                   return res;
               }
               res.res=new Sub(x,y);
           }
           else
           {
               if(x+y>100){
                   res.id=2;
                   return res;
               }
               res.res=new Add(x,y);
           }
       }catch (Exception e)
       {
           res.id=1;
           return res;
       }

        return res;
    }
    public static  void  solve(int x)
    {
        char[] sg ={'-','+'};

        while(true)
        {
            int a= (int) (Math.random()*100);
            int b= (int) (Math.random()*100);

            char sign=sg[x%2];
            Res res = check(String.valueOf(a), String.valueOf(sign), String.valueOf(b));
            if(res.id==0 && !set.contains(res.res))
            {
                set.add(res.res);
                return;
            }
        }


    }


    public static void test()
    {
        String a,f,b;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            a=sc.next();
            f=sc.next();
            b=sc.next();
            Res res=check(a,f,b);
            switch (res.id)
            {
                case 0:
                    System.out.println(res.res);
                    break;
                case 1:
                    System.out.println("输入不合法！");
                    break;
                case 2:
                    System.out.println("算式合法 但计算结果不符合要求！");
                    break;
                default:
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = {5,6,7,23,24,25,59,60,61,119,120};
        for (int cnt : arr) {
            set = new HashSet<>();
            for(int i=1;i<=cnt;i++)
            {
                int x= (int) (Math.random()*100);
                solve(x);
            }

            System.out.println("\n--------------------------------------");
            int n=0;

            for(Ss d:set)
            {
                System.out.print(d +"\t");
                n++;
                if(n%6==0) System.out.println();
            }
        }




        test();
    }
}
