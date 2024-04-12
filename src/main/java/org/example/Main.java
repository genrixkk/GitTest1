package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <git> void main(String[] args) {
        String name = "Kirill";
        int age = 18;
        float weight = 65.3F;
        System.out.println("Name: " + name + ", Age: "+ age + ", Weight" + weight);

       int a = 1;
       int b = 2;

        System.out.println("Before swaping : a = " + a + " b = "+b);
        a = a^b^(b = a);
        System.out.println("After swaping : a = " + a + " b = " +b);

        int y = 5;
        int z = 3;

        System.out.println("Before swaping : y = " + y + " z = "+z);
        y = y^z^(z = y);
        System.out.println("After swaping : y = " + y + " z = " +z);







    }
}
