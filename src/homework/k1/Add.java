package homework.k1;

public class Add {
    private int a,b;

    public Add(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString() {
        return a+" + " + b+" = "+ (a+b);
    }
}
