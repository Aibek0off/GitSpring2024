package codingBat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        return str.length() <= 3 ? str : str.length()%2 == 0 ? str.substring(str.length()/2-1, str.length()/2+1) : str;
    }
}
