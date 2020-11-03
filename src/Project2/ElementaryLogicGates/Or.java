package Project2.ElementaryLogicGates;

public class Or {

    public boolean out;
    private Nand nand1, nand2, nand3;
    public Or() {
        nand1=new Nand();
        nand2=new Nand();
        nand3=new Nand();
    }

    public void compute(boolean a, boolean b){
        nand1.compute(a,a);
        nand2.compute(b,b);
        nand3.compute(nand1.out, nand2.out);
        out=nand3.out;
    }

}
