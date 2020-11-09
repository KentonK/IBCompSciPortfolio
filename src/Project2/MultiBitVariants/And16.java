package Project2.MultiBitVariants;
import Project2.ElementaryLogicGates.And;
public class And16 {
    public boolean[] out=new boolean[16];
    public And[] and16 = new And[16];

    public And16(){
        for (int i=0;i<16;i++){
            and16[i]= new And();

        }

    }

    public void compute(boolean[] a, boolean[] b){
        for(int i=0;i<16;i++){
            and16[i].compute(a[i],b[i]);
            out[i]=and16[i].out;
        }
    }
}
