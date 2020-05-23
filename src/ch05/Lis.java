package ch05;

public class Lis {
    static int a (final int array[], final int n) {


        final int a [] = new int [n];
        int i,j, max = 0;

        for (i=0; i < n; i++)
            a[i] = 1;

        for (i=1; i < n; i++)
            for (j = 0; j < i; j++)
                if (array[i] > array[j] && a [i] < a [j] + 1)
                    a[i] = a [j] + 1;

        for (i = 0; i < n; i ++)
            if  (max < a [i])
                max = a [i];

        return max;


    }


    public static void main(final String[] args) {

        final int array  [] = {5,2,9,7,1,6,8,3,10,4};
        System.out.println("Array : ");
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i]+ "");
        }

        final int n = array.length;
        System.out.println();
        System.out.println("Length of LIS = " + a(array, n) + "\n");


    }


}