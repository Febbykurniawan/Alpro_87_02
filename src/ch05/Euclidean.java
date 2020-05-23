package ch05;

public class Euclidean {

    public static int sru(int a, int b) {

        if (a == 0)
            return b;

        return sru(b % a, a);

    }

    
    public static void main (String[] args) {

        int a = 25;
        int b = 10, c;
        c = sru(a, b);
        System.out.println("SRU dari (" + a + " , " + b + ") = " + c);


    }



}