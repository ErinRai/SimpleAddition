/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Erin
 */
public class SortAndSearch {
    public static void main(String[] args)
    {
        Random generator = new Random();
        int found = -1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            numbers.add(generator.nextInt(100)+1);
        }
        System.out.println("Unsorted");
        printNumbers(numbers);
    }
    
    public static void printNumbers(ArrayList<Integer> nums){
        for(int i =0; i<nums.size();i++)
        {
            System.out.printf("%d",nums.get(i));
        }
            System.out.println();
    }
}
