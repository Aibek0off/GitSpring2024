package codingBat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        return str.length() > 3 ? str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2)
                : str + str + str;
    }
}
