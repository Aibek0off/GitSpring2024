package codingBat.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        return index < 0 || index >= str.length()-1 ? str.substring(0, 2) : str.substring(index, index+2);
    }
}
