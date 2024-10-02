package codingBat.warmup1;

public class Front22 {
    public String front22(String str) {
        return str.length() >= 3 ? str.substring(0,2) + str + str.substring(0,2) : str + str + str;
    }
}
