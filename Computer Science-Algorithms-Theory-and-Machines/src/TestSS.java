import java.util.Scanner;

public class TestSS {
    //Test client for sequential search
    //Print time required for 10N searches in a whitelist of length N
    public static int search(String key, String[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i].compareTo(key)==0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words=new String[10];
    }
}
