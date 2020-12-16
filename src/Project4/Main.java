package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path="/Users/Kenton/Desktop/CS/";

        File myfile=new File(path+"file.csv");
        Parser parser = new Parser(myfile);
        double data = parser.findAverage();

        Writer writer = new Writer(path+"out.csv");
        writer.writeData(Double.toString(data));

    }
}
