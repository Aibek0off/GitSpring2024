package codingBat.string1;

public class HasBad {
    public boolean hasBad(String str) {
        return (str.length() >= 3 && str.startsWith("bad")) || (str.length() >=4 && str.substring(1, 4).equals("bad"));
    }
}
