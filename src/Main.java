import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var vector = generateVector(1000, new Random());
        var oddThread = new ThreadVetor(vector, 1);
        var evenThread = new ThreadVetor(vector, 2);

        oddThread.start();
        evenThread.start();
    }
        
    private static int[] generateVector(int size, Random random) {
        var numbers = new int[size];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }

        return numbers;
    }
}
