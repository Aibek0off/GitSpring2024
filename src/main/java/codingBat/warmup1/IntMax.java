package codingBat.warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int maxN = Math.max(a, b);
        return Math.max(maxN, c);
    }
}
