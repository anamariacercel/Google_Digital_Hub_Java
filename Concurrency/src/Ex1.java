import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static long v = 0;

    public static void main(String[] args) throws InterruptedException {
        List<myThread> threadList = new ArrayList<>();

        System.out.println("Before: " + v);

        for(int index = 0; index < 5_000; index++) {
            threadList.add(new myThread());
        }

        for(int index = 0; index < 5_000; index++) {
            threadList.get(index).start();
            threadList.get(index).join();
        }

        System.out.println("After: " + v);
    }
}
class myThread extends Thread {
    @Override
    public void run() {
        for(int index = 1; index <= 1_000_000; index++) {
            Ex1.v++;
        }
    }
}
