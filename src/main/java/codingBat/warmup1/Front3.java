package codingBat.warmup1;

public class Front3 {
    public String front3(String str) {
        return str.length() < 3 ? str + str + str : str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }
}
