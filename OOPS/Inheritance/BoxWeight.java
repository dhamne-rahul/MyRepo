package OOPS.Inheritance;

public class BoxWeight extends Box {
    public double weight;
    
    BoxWeight(double l,double w,double h,double weight)
    {
        super(l, w, h);
        this.weight=weight;
    }
}
