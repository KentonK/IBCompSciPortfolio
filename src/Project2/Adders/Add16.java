package Project2.Adders;

public class Add16 {
    public boolean[] sum = new boolean[16];
    private FullAdder[] full=new FullAdder[16];
    public Add16() {
        for (int i = 0; i < 16; i++) {
            full[i]=new FullAdder();
        }
    }

    public void compute(boolean[] a,boolean[] b){
        full[0].compute(a[0],b[0],false);
        sum[0]=full[0].sum;
        for (int i = 1; i < 16; i++) {
            full[i].compute(full[i-1].carry,a[i],b[i]);
            sum[i]=full[i].sum;
        }
    }
}

