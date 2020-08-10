package com.example.java;

public class Tri
{
    public void rectangle()
    {
        for (int i=0; i<5; i++)
        {
            for(int j=0; j<10; j++)
            {
                System.out.printf("O");
            }
            System.out.println();
        }
    }

    public void inverted_triangle()
    {
        for (int i=0; i<10; i++)
        {

            for (int j=i; j<10; j++)
            {
                System.out.printf("O");
            }
            System.out.println();
        }
    }

    public void right_triangle()
    {
        for (int i=10; i>0; i--)
        {

            for (int j=i; j<10; j++)
            {
                System.out.printf("O");
            }
            System.out.println();
        }
    }

    public void diamond(int n)
    {
        int i=0, j=0, k=0;
        //    *     l=1 s=4 *=1
        //   ***    l=2 s=3 *=3
        //  *****   l=3 s=2 *=5
        // *******  l=4 s=1 *=7
        //********* l=5 s=0 *=9 -- 5 line

        // *******  l=6 s=1 *=7
        //  *****   l=7 s=2 *=5
        //   ***    l=8 s=3 *=3
        //    *     l=9 s=4 *=1 -- 4 line
        for (i=10; i>0; i--)
        {

            for (j=i; j<10; j++)
            {
                System.out.printf("O");
            }
            System.out.println();
        }
    }
}
