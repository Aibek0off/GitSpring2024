package codingBat.warmup1;

public class StringE {
    public boolean stringE(String str) {
        int eCount = str.length() - str.replaceAll("e", "").length();
        return eCount >= 1 && eCount <= 3;
    }
}
