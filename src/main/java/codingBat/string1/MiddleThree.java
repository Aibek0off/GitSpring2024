package codingBat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        return str.length() >= 3 ? (str.length()%2 == 1 ? str.substring(str.length()/2-1, str.length()/2+2) : str) : str;
    }
}
