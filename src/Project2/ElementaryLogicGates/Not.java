package Project2.ElementaryLogicGates;

public class Not {
    //instance variables, what object is made up of
    public boolean out;
    private Nand nand1;

    public Not() {
        nand1=new Nand();

    }//constructor method, makes the object

    public void compute(boolean in){
        nand1.compute(in, in);
        out=nand1.out;
    }//for running the wanted code

}
