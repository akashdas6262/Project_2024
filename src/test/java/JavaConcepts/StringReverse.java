package JavaConcepts;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Hello World";
        String reversedStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }
        System.out.println(reversedStr);


    }
}
