package com.java.certification.arrays;

public class EjavaGuruArray1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        byte b=4;
        char c='c';
        long longVar=10;
        arr[0]=b;
        arr[1]=c;
        //arr[3]=longVar; compilation error

        int[] arr1;
        int[] arr2 = new int[3];

        char[] arr3 = {'a', 'b'};

        arr1=arr2;
        //arr1=arr3; compilation error
        System.out.println(arr1[0] +":"+arr1[1]);



    }
}
