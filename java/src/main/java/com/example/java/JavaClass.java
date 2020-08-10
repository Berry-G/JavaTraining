package com.example.java;

public class JavaClass
{
    public static void main(String[] args)
    {
        Test test = new Test();
        test.hello();
        test.printText("TEXT PRINT TEST YEAH YEAH BERRY GLASS");
        test.divideLine();
        //  can not unicord
        //  can only output. cannot input!

        Tri tri = new Tri();
        tri.rectangle();
        System.out.println();

        tri.right_triangle();
        System.out.println();

        tri.inverted_triangle();
        System.out.println();

        tri.diamond(5);
        test.divideLine();



        Node one = new Node(10, 20);
        Node two = new Node(30,40);
        Node result = one.getCenter(two);

        System.out.println("x : " + result.getX() + ", y: " + result.getY());


    }
}