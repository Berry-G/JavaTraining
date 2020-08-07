package com.example.java;

public class JavaClass
{
    public static void main(String[] args)
    {
        Test test = new Test();
        test.hello();
        test.printText("TEXT PRINT TEST YEAH YEAH BERRY GLASS");
        test.divideLine();
        // 1. 안드로이드 스튜디오 콘솔은 유니코드 출력이 불가한듯 하다.
        // 2. 콘솔은 출력만가능하다. 입력이 불가능한듯 하다.

        Tri tri = new Tri();
        tri.right_triangle();



        Node one = new Node(10, 20);
        Node two = new Node(30,40);
        Node result = one.getCenter(two);

        System.out.println("x : " + result.getX() + ", y: " + result.getY());


    }
}