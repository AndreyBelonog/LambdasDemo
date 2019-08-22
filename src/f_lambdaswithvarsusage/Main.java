package f_lambdaswithvarsusage;

interface Sum {
    int sum(int x, int y);
}

class SumImpl {
    int doSum(Sum s) {
        return s.sum(1, 1);
    }
}

public class Main {
    public static void main(String[] args) {
        SumImpl sumImpl = new SumImpl();
        System.out.println(sumImpl.doSum((int x, int y) -> x + y));

        final int z = 320;
        System.out.println(sumImpl.doSum(((x, y) -> x + y + z)));

        int i = 319;
        i = 320;
//        System.out.println(sumImpl.doSum((x, y) -> x + y + i));
    }
}
