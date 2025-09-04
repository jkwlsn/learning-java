public class Main implements Runnable {
    public static int amount = 0;
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        while(thread.isAlive()) {
      System.out.println("Waiting...");
    }
        System.out.println("Amount outside thread:\t" + amount);
        amount++;
        System.out.println("Amount outside thread:\t" + amount);
        amount++;
        System.out.println("Amount outside thread:\t" + amount);
    }
    public void run() {
        System.out.println("Amount inside thread:\t" + amount);
        amount++;
        System.out.println("Amount inside thread:\t" + amount);
        amount++;
        System.out.println("Amount inside thread:\t" + amount);
    }
}
