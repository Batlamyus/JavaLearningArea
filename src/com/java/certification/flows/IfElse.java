package com.java.certification.flows;

public class IfElse {
    public static void main(String[] args) {
        String result="1";
        int score =10;
        if((score=score+10)==100)
            result="A";
        else if((score=score+29)==50)
            result="B";
        else if((score=score+200)==10)
            result="C";
        else
            result="F";
        System.out.println(result +":"+score);

        boolean testValue = true;

        if(!testValue)
            result="AA"; score=111;

        System.out.println(result +":"+score);





    }
}
