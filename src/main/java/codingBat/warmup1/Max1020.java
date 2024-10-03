package codingBat.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        a = (a >= 10 && a <= 20) ? a : 0;
        b = (b >= 10 && b <= 20) ? b : 0;
        return Math.max(a, b);
    }
}
