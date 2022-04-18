package com.company;

public class Main1 {
    public static void main(String[] args)
    {
        /*float test = 1/2;
        System.out.println(test);

        double a = 2.0 - 1.1;
        System.out.println(a);
        System.out.println(0/.0 == 0/.0);
        System.out.println(2.0 - 1.1f != 2 - 1.1);

        int x = 2;
        int y = 12;

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
*/
        short z = 3;
        boolean b = !(z <= 3 || z > 3);
        System.out.println(b);

        int v = 7;
        int k = 4;

        System.out.println(-v % k);
        System.out.println(v % -k);
        System.out.println((-v % k) == (v % -k));

    }
}
