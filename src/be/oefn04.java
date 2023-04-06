package be;

public class oefn04 {

    public static int average(int... values){
        int sum =0;
        for(int el:values){
            sum += el;
        }

        int avg = 0;
        if(values.length != 0){
            avg = sum/values.length;
        }
        return avg;


    }

    public static int maximum(int...values){
        int max = values[0];
        for(int i=1;i< values.length;i++){
            if(values[i]< min){
                min =values[i]
            }
        }
    }
}
