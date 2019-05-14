package com.xxyp.test;

public class Test {
    public static void main(String[] args) {
//        int i  = 16;
//        i >>= 3;
//        System.out.println(i);
//        i >>= 1;
//        System.out.println(i);
        hash(1);
        System.out.println("args = [" + 1 + "]");
        hash(2);
        System.out.println("args = [" + 2 + "]");
        hash(3);
        System.out.println("args = [" + 3 + "]");
        hash(4);
        System.out.println("args = [" + 4 + "]");
    }

    private static int hash (int h){
        h += (h <<15) ^ 0xffffcd7d;
        System.out.println("h = [" + h + "]");
        h ^= (h >>> 10);
        System.out.println("h = [" + h + "]");
        h += (h << 3);
        System.out.println("h = [" + h + "]");
        h ^= (h >>>6);
        System.out.println("h = [" + h + "]");
        h += (h << 2) + (h << 14);
        System.out.println("h = [" + h + "]");
        return h ^ (h >>> 16);
    }
}
