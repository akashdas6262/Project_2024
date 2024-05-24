package JavaConcepts;

public class CountNumberOfSpace {

    public static void main(String[] args) {
        String s = "Lets test this";
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
        String NewString = s.replaceAll(" ", "+");
        System.out.println(NewString);
    }


}
