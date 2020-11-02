package Project2.ElementaryLogicGates;

public class And {

    public boolean out;
    private Not not1;
    private Nand nand1;

    public And() {
        not1=new Not();
        nand1=new Nand();
    }

    public void compute(boolean a, boolean b){
        nand1.compute(a,b);
        not1.compute(nand1.out);
        out=not1.out;
    }
}
