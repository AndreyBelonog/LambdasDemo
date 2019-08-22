package c_zelastsimpleexample;

interface Executable {
    void execute();
}


class Executor {
    public void performExecute(Executable e) {
        e.execute();
    }
}


class ExecutableImpl implements Executable {
    @Override
    public void execute() {
        System.out.println("Boring...");
    }
}


public class Main {
    public static void main(String[] args) {
//First way - Creating a class-implementation for the argument interface
        Executor executor = new Executor();
        executor.performExecute(new ExecutableImpl());


//Second way - Creating an anonymous function for implementing the only method
        executor.performExecute(new Executable() {
            @Override
            public void execute() {
                System.out.println("Boring2...");
            }
        });

//Third way - Creating an anonymous function
        executor.performExecute(() -> System.out.println("Not really boring!"));
    }


}
