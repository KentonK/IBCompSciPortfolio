package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String dir = "Machintosh Data/Users/Kenton/Documents/IB_CompSci/IBCompSciPortfolio-1/src/Project4";

        File myFile = new File(dir+"unsorted.csv");
        Parser parser = new Parser(myFile);
        String[] sortedArray = parser.sortAscending();

        Writer writer = new Writer(dir+"output.csv");
        writer.writeArrayData(sortedArray);


    }
}