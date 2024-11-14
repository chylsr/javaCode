package homework.k1;

public class Sub {
    private int a,b;

    public Sub(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString() {
        return a+" - " + b+" = "+ (a-b);
    }
}
