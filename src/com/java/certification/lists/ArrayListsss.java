package com.java.certification.lists;

import java.util.ArrayList;

public class ArrayListsss {
    public static void main(String[] args) {
        ArrayList<String> strlist = new ArrayList<>();
        ArrayList<Long> lngList = new ArrayList<>();
        //lngList.add(10);
        lngList.add((long) 10);

        System.out.println(lngList.get(0));
        ArrayList lstcopy= (ArrayList) lngList.clone();
        System.out.println(lstcopy.get(0));

        ArrayList<String> ejg = new ArrayList<>();
        ejg.add("One");
        ejg.add("two");
        ejg.add(new String("three"));
        System.out.println(ejg.contains(new String("One")));
        System.out.println(ejg.indexOf("two"));
        ejg.clear();
        System.out.println(ejg);
        //System.out.println(ejg.get(1));
        System.out.println("-------------------------");

        ArrayList<String> strLisr1 = new ArrayList<>();
        strLisr1.add("One");
        strLisr1.add("Two");
        strLisr1.add("Three");
        ArrayList strList1Copy = (ArrayList)strLisr1.clone();

        strLisr1.add(0,"Four");
        System.out.println(strLisr1.get(0));
        System.out.println(strList1Copy.get(0));
        System.out.println("-------------------------");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        ArrayList intListCopy= (ArrayList)intList.clone();
        intList.add(1,5);
        System.out.println(intList.get(1));
        System.out.println(intListCopy.get(1));
        System.out.println("-------------------------");



    }
}
