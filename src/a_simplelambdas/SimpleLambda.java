package a_simplelambdas;

public class SimpleLambda {

    public static void main(String[] args) {


//        Creating thread in a bad way :
        Thread badThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("322");
            }
        });
        badThread.start();


//        Creating thread in a good way :
        Thread goodThread = new Thread(() -> System.out.println("322"));
        goodThread.start();

    }
}
