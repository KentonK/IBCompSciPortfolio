package Project2.MultiBitVariants;
import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    public Or[] ors=new Or[7];

    public Or8Way(){
        for (int i = 0; i < 7; i++) {
            ors[i]=new Or();
        }
    }

    public void compute(boolean[] in){
        for (int i = 0; i < 4; i++) {
            ors[i].compute(in[i*2], in[i*2 + 1]);
        }
        for (int i = 4; i < 7; i+=2) {
            ors[i].compute(ors[i-4].out,ors[i-3].out);
        }
        ors[5].compute(ors[4].out,ors[6].out);
        out=ors[5].out;
    }

}
