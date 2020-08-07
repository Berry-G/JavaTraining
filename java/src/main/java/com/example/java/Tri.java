package com.example.java;

public class Tri {
    public void inverted_triangle()
    {
        for (int i=0; i<10; i++)
        {
            System.out.println();
            for (int j=i; j<10; j++)
            {
                System.out.printf("O");
            }
        }
    }

    public void right_triangle()
    {
        for (int i=10; i>0; i--)
        {
            System.out.println();
            for (int j=i; j<10; j++)
            {
                System.out.printf("O");
            }
        }
    }


}
