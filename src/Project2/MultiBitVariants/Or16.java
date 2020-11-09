package Project2.MultiBitVariants;
import Project2.ElementaryLogicGates.Or;
public class Or16 {
    public boolean[] out = new boolean[16];
    public Or[] ors=new Or[16];
    public Or16() {
        for (int i = 0; i <16; i++) {
            ors[i]=new Or();
        }
    }

    public void compute(boolean[] a,boolean[] b){
        for (int i = 0; i < 16; i++) {
            ors[i].compute(a[i],b[i]);
            out[i]=ors[i].out;
        }
    }
}
