package org.itstep;

/**
 * Created by Вадим on 28.09.2015.
 */
public class Init {
    public static void main(String[] args) {
//        int stat = Sub.stat;
        Sub s = new Sub();
    }

}
class Sub extends Super {
    static {
        System.out.println("Sub Static block");
    }
    public int x = fieldInit();

    public static int stat = staticFieldInit();

    {
        System.out.println("Sub Field block");
    }

    Sub() {
        System.out.println("Sub Construct");
    }

    private static int staticFieldInit() {
        System.out.println("Sub Static field");
        return 0;
    }

    private int fieldInit() {
        System.out.println("Sub Field");
        return 10;
    }

}

class Super {
    static {
        System.out.println("Super Static block");
    }
    public int x = fieldInit();

    public static int stat = staticFieldInit();

    {
        System.out.println("Super Field block");
    }

    Super() {
        System.out.println("Super Construct");
    }

    private static int staticFieldInit() {
        System.out.println("Super Static field");
        return 0;
    }

    private int fieldInit() {
        System.out.println("Super Field");
        return 10;
    }

}