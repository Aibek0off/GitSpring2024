package codingBat.warmup1;

public class StartHi {
    public boolean startHi(String str) {
        return str.length() > 1 && str.substring(0,2).equals("hi");
    }
}
