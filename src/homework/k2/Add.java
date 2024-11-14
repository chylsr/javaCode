package homework.k2;

import java.util.Objects;

public class Add extends  Ss{

    public Add(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Add add = (Add) o;
        return a == add.a && b == add.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return String.format("%3d + %3d  = %3d",a,b,(a+b));
    }
}
