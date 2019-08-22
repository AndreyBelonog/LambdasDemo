package e_collisionofvarnames;

interface FuncInterface {
    void print(String s);
}

class FuncInterfaceImpl {
    void print(FuncInterface i) {
        i.print("111");
    }
}


public class Test {
    public static void main(String[] args) {
        String s = "322";

        new FuncInterfaceImpl().print((String x) -> System.out.println(x + s));

//        System.out.println(x);
    }
}
