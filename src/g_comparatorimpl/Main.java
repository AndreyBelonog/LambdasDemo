package g_comparatorimpl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listToSort = Arrays.asList("bb", "a", "CCC", "FFFFFFFFFFFFFFF", "eeeeeeee", "ddddddd", "ddddddd");

        System.out.println(listToSort);

        listToSort.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                else return 0;
            }
        });

        System.out.println(listToSort);
    }
}
