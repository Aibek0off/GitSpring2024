package codingBat.string1;

public class SeeColor {
    public String seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }
}
