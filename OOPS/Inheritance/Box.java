package OOPS.Inheritance;

public class Box {
    public double l;
    public double w;
    public double h;

    Box()
    {
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
    Box(double l,double w,double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box other)
    {
        this.l=other.l;
        this.w=other.w;
        this.h=other.h;
    }
}
