
import java.util.ArrayList;

public class Model {
    public double sum(double x, double y) {
        return x + y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double diff(double x, double y) {
        return x - y;
    }

    public boolean contains(String[] arr, String value) {
        for (String s : arr) {
            if (s.equals(value)) return true;
        }
        return false;
    }

    public String[] remove(String[]arr, int idx){
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i!=idx && i!=idx+1) temp.add(arr[i]);
        }
        return temp.toArray(new String[0]);
    }
}