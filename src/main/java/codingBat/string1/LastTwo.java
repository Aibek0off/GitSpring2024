package codingBat.string1;

public class LastTwo {
    public String lastTwo(String str) {
        return str.length() < 2 ? str :
                str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
}
