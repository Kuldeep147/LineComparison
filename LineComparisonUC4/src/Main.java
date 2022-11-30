import com.bzl.LineComparison;

public class Main {
    public static void main(String[] args) {
        LineComparison l1 = new LineComparison();
        LineComparison l2 = new LineComparison();
        double k = l1.LineComparison(10,12,34,23);
        System.out.println("length l1 : "+k);
        double v = l2.LineComparison(20,30,40,50);
        System.out.println("length l2 : "+v);
        String h = l1.compareTo(k,v);
        System.out.println("compareto : "+h);
        }
    }