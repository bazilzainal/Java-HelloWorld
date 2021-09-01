package com.tabswithspaces;

import java.util.ArrayList;
import java.util.Arrays;

public class StringLiteral {

    public static void main(String[] args) {
        String message = "Hello \"World\"" + " !!";
        System.out.println(message.replace("!", "#"));
        System.out.println(message.length());

        int[] test1 = new int[]{1, 2, 3};

        int[] numbers = {2, 3, 4, 5, 1, 4, 4};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("SORTING....");
        System.out.println(Arrays.toString(numbers));
        System.out.println("numbers is " + numbers.length + " numbers long.");


        System.out.println(Arrays.toString(test1));
        System.out.println(test1.length);

        ArrayList<Integer> test2 = new ArrayList<>();

        test2.add(2);
        test2.add(6);
        test2.add(5);
        test2.add(4);
        test2.add(3);

        System.out.println(test2.contains(8));
        System.out.println(test2.size());

        int[][] deep = new int[2][3];
        deep[0][1] = 2;
        //test comment
        System.out.println(Arrays.deepToString(deep));
    }
}
