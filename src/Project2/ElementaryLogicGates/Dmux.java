package Project2.ElementaryLogicGates;

public class Dmux {

    public boolean a;
    public boolean b;
    private And andA, andB;
    private Not notA;

    public Dmux() {
        andA=new And();
        andB=new And();
        notA=new Not();
    }

    public void compute(boolean in, boolean sel){
        notA.compute(sel);
        andA.compute(in, notA.out);
        andB.compute(in, sel);
        a=andA.out;
        b=andB.out;
    }
}
