package com.company;

public class Main {

    public static void main(String[] args) {

        String s1 = "bdfkmp";
        String s2 = "aely";

        System.out.println(sortedString(s1, s2));
    }

    public static String sortedString(String s1, String s2)
    {

        StringBuilder s3 = new StringBuilder();

        while (!s1.isEmpty() && !s2.isEmpty())
        {
            if (s1.charAt(0) < s2.charAt(0))
            {
                s3.append(s1.charAt(0));
                s1 = s1.substring(1, s1.length());
            }
            else {
                s3.append(s2.charAt(0));
                s2 = s2.substring(1, s2.length());
            }
        }
        s3.append(s1 + s2);
        return s3.toString();
    }

}
