package com.java.certification.datatype;

public class PrimitiveTypes {

    public static void printExample(int i){
        System.out.println("-------Example"+i+"------");
    }
    public static void example1(){
        printExample(1);
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);//3
        System.out.println(res);//true
    }
    public static void main(String [] args) {
        example1();
    }
}
