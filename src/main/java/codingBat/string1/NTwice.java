package codingBat.string1;

public class NTwice {
    public String nTwice(String str, int n) {
        return str.length() >= n ? str.substring(0, n) + str.substring(str.length()-n) : str;
    }
}
