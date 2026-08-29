package Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = input.nextInt();
        int[] rollNums = new int[size];
        System.out.println("Enter the elements of Array : ");
        
        for(int i = 0; i < size; i++)
        {
            rollNums[i] = input.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println(rollNums[i]);
        }
    }
}
