package codingBat.string1;

public class DeFront {
    public String deFront(String str) {
        if(str.length() < 2) return str;
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        return (firstChar == 'a' ? String.valueOf(firstChar) : "") + (secondChar == 'b' ? String.valueOf(secondChar) : "") + (str.length() > 2 ? str.substring(2) : "");
    }
}
