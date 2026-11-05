package lab2.src;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static int[] shiftArray(int[] a, int shift) {
        if (a != null) {
            int length = a.length;
            int[] b = new int[length];
            System.arraycopy(a, shift, b, 0, length - shift);
            System.arraycopy(a, 0, b, length - shift, shift);
            return b;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No task was chosen");
            return;
        }
        
        switch(args[0]) {
            case "-t1" : {
                if (args.length < 2) {
                    System.out.println("Shift required");
                    return;
                }
                Scanner in = new Scanner(System.in);
                System.out.print("Array length: ");
                int length = in.nextInt();
                int[] nums = new int[length];

                Random random = new Random();

                for (int i = 0; i < length; i++) {
                    nums[i] = random.nextInt(100);
                }

                int[] shifted_nums = shiftArray(nums, Integer.parseInt(args[1]));
                System.out.println(Arrays.toString(nums));
                System.out.println(Arrays.toString(shifted_nums));
                in.close();
                return;
            }

            case "-t2" : {
                if (args.length < 3) {
                    System.out.println("Require array dimensions");
                    return;
                }
                if (Integer.parseInt(args[1]) <= 0 || Integer.parseInt(args[2]) <= 0) {
                    System.out.println("Invalid array dimensions");
                    return;
                }

                int dim_1 = Integer.parseInt(args[1]);
                int dim_2 = Integer.parseInt(args[2]);
                int[][] array = new int[dim_1][dim_2];

                Random random = new Random();

                for (int i = 0; i < dim_1; i++) {
                    for (int j = 0; j < dim_2; j++) {
                        array[i][j] = random.nextInt(100);
                    }
                }
                ArrayList<Integer> odds = new ArrayList<Integer>();
                ArrayList<Integer> evens = new ArrayList<Integer>();
                for (int i = 0; i < dim_1; i++) {
                    for (int j = 0; j < dim_2; j++) {
                        if (array[i][j] % 2 == 0) {
                            evens.add(array[i][j]);
                        } else {
                            odds.add(array[i][j]);
                        }
                    }
                }

                Integer[] odds_array = new Integer[odds.size()];
                Integer[] evens_array = new Integer[evens.size()];

                odds_array = odds.toArray(odds_array);
                evens_array = evens.toArray(evens_array);
                System.out.println(Arrays.toString(evens_array));
                System.out.println(Arrays.toString(odds_array));
                return;
            }
        }
    }
}
