package Project2.Adders;
import Project2.ElementaryLogicGates.Or;
public class FullAdder {

    public boolean sum;
    public boolean carry;
    private HalfAdder half1, half2;
    private Or or;
    public FullAdder() {
        half1=new HalfAdder();
        half2=new HalfAdder();
        or=new Or();
    }

    public void compute(boolean a, boolean b, boolean c){
        half1.compute(a,b);
        half2.compute(half1.sum,c);
        or.compute(half1.carry,half2.carry);
        sum=half2.sum;
        carry=or.out;
    }
}
