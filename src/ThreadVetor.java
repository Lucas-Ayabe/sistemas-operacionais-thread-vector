public class ThreadVetor extends Thread {
    private int[] source;
    private int type;

    public ThreadVetor(int[] source, int type) {
        this.source = source;
        this.type = type;
    }


    @Override
    public void run() {
        System.out.println(calculateTime());
    }

    private double calculateTime() {
        long start = System.nanoTime();

        if (type % 2 == 0) runEven();
        else runOdd();

        long finalTime = System.nanoTime() - start;
        return finalTime / Math.pow(10, 9);
    }

    private void runEven() {
        for (int i = 0; i < source.length; i++);
    }

    private void runOdd() {
        for (int number : source);
    }
    
}
