package com.java.memory;

public class ObjectCopy implements Cloneable{

    String name;
    int number;

    public ObjectCopy(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public Object cone() throws CloneNotSupportedException{
        return super.clone();
    }


    public static void main(String[] args) {
        ObjectCopy obj1 = new ObjectCopy("Isim",1);
        ObjectCopy obj2 = obj1;
        ObjectCopy obj3=null;
        try {
            obj3 = (ObjectCopy) obj1.clone();
        }catch (CloneNotSupportedException c){}


        obj2.setNumber(2);

        System.out.println("OBJ1: "+ obj1.getNumber());
        obj1.setName("ISIM2");
        System.out.println("OBJ2: "+ obj2.getName());
        System.out.println("OBJ3: "+ obj3.getName());

    }
}
