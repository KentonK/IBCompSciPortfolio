package weekProblems.code0208;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class ProblemOne {

    public int[] average=new int[8];
    public int topAverage, weeks;
    public ProblemOne(int in) {
        List<Integer> passengers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < in; i++) {
            passengers.add(random.nextInt(700));
        }
        int[] people=new int[passengers.size()];
        for (int i =0; i < passengers.size(); i++) {
            people[i] = passengers.get(i);
        }
        for (int i = 0; i < 8; i++) {
            count(i, people);
        }
    }

    public String convert(int in){
        switch(in){
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
        }
        return "unidentified";
    }
    public void count(int day, int[] people){
        List<Integer> counting = new ArrayList<Integer>();
        int tempSum=0;
        int extra=people.length%7;
        int weeks=people.length/7;
        int i=0;
        while (i<weeks){
            i++;
            tempSum+=people[i*7+day];
        }
        counting.add(tempSum/weeks+extra);
        if (i==7){
            for (int j=0; j < counting.size(); j++) {
                if (j==7){average[j]=0;}
                else {average[j] = counting.get(j);}
            }
        }
    }

    public String top(){
        int largest=8;
        for (int i = 0; i < average.length; i++) {
            if(average[largest]<average[i]){
                largest=i;
            }
        }
        return "The day with the most passengers is "+convert(average[largest])+" with a total of "+average[largest]+" days.";
    }

}
