package com.java.certification.arrays;

import java.util.Arrays;

public class Arraysss {

    public int[] createSimpleArray(int i){
        int intArray[] = new int[i];
        return intArray;
    }

    public static void main(String[] args) {
        String[] strArray = new String[2*5];
        strArray = new String[Math.max(2,3)];
        int[] multiArr[];//compile
        multiArr = new int[2][3];//compile
        multiArr = new int[2][];//compile
        //multiArr = new int[][3]; wont compile
        String[] strArray2={"one","two"};
        //int[] intArray2 = new int[2]{1,2}; //Wont compile
        String multiStrArr[][] = new String[][]{{"a","b"},{"f","h"},{"c","d","e"}};
        System.out.println(Arrays.deepToString(multiStrArr));



    }
}
