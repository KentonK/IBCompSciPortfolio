package Project2.MultiBitVariants;
import Project2.ElementaryLogicGates.Not;

public class Not16 {
    public boolean[] out = new boolean[16];
    public Not[] nots = new Not[16];

    public Not16() {
        for (int i = 0; i < 16; i++) {
            nots[i]=new Not();
        }
    }

    public void compute(boolean[] in){
        for (int i = 0; i < 16; i++) {
            nots[i].compute(in[i]);
            out[i]=nots[i].out;
        }
    }
}
