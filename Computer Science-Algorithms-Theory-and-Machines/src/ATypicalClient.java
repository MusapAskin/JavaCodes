public class ATypicalClient {

    public static int search(String key, String[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i].compareTo(key)==0)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        String[] name = {"alice", "bob", "carlos",
                "craig", "dave", "erin", "frank",
                "oscar", "peggy", "trent", "walter"};
        search("oscar", name);
    }
}
