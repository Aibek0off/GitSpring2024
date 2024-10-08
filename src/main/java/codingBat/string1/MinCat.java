package codingBat.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int minAB = Math.min(a.length(), b.length());
        return a.substring(a.length() - minAB) + b.substring(b.length() - minAB, b.length());
    }
}
