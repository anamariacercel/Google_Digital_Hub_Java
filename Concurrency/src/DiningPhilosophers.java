
public class DiningPhilosophers {
    public static void main(String[] args) throws Exception {

    final Philosopher[] philosophers = new Philosopher[5];
        Object[] chopsticks = new Object[philosophers.length];

        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftchopstick = chopsticks[i];
            Object rightchopstick = chopsticks[(i + 1) % chopsticks.length];

            if (i == philosophers.length - 1) {

                // The last philosopher picks up the right fork first
                philosophers[i] = new Philosopher(rightchopstick, leftchopstick);
            } else {
                philosophers[i] = new Philosopher(leftchopstick, rightchopstick);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
