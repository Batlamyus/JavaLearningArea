package com.java.certification.datatype;

public class Strings {
    public static void main(String[] args) {
        String ejg = "game".replace('a','Z').trim().concat("Aa");
        System.out.println(ejg);
        ejg.substring(0,2);
        System.out.println(ejg);
        System.out.println(ejg.substring(0,2));

        String ejg2 = "game";
        ejg2.replace('a','Z').trim().concat("Aa");
        ejg2.substring(0,2);
        System.out.println(ejg2);

        StringBuilder ejg3 = new StringBuilder(10+2+"SUN"+4+5);
        ejg3.append(ejg3.delete(3,6));
        System.out.println(ejg3);

        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2,4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
    }
}

