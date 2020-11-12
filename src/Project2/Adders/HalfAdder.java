package Project2.Adders;
import Project2.ElementaryLogicGates.And;
import Project2.ElementaryLogicGates.Xor;
public class HalfAdder {
    public boolean sum;
    public boolean carry;
    private And and;
    private Xor xor;
    public HalfAdder() {
        xor=new Xor();
        and=new And();
    }

    public void compute(boolean a, boolean b){
        and.compute(a,b);
        xor.compute(a,b);
        sum=xor.out;
        carry=and.out;
    }

}
