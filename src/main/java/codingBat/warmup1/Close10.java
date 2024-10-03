package codingBat.warmup1;

public class Close10 {
    public int close10(int a, int b) {
        int numberA = Math.abs(10-a);
        int numberB = Math.abs(10-b);
        return numberA < numberB ? a : (numberB < numberA ? b : 0);
    }
}
