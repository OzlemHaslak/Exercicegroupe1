package oca.soru97;

public class soru97 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())) {
            System.out.println("match 1");
        } else if (sb.equals(s)) {
            System.out.println("match 2");

        }else {
            System.out.println("no match");
        }
    }
}
