package _1_PreliminaryPeriod._5_week5_ArrayListAndStack.Stack_and_Array_Exercise;

import java.util.*;
import java.lang.Math;

public class StackClass {
    Stack StackList = new Stack();
    int[] ArrayList;

    public void ArrayList() {
        Scanner scan = new Scanner(System.in); //Accepts user input for size of array

        int minval = 1;
        int maxval = 100;
        
        System.out.println("Enter Length of Array List: ");
        int length = scan.nextInt(); //Scans user input for amount of numbers to be added to the list

        ArrayList = new int[length];
        for (int i = 0; i < ArrayList.length; i++)
        {
            ArrayList[i] = (int) (Math.random()*maxval)+minval;// Random Integer Values will be  between the maxval and minval
            System.out.println("Adding: " + ArrayList[i]);
        }
        scan.close();
    }   

    public void add() {
        System.out.println("Stack List before Pushing: " + StackList);
        for (int i = 0; i < ArrayList.length; i++){
            StackList.push(ArrayList[i]);
        }
    }

    public void result() {
        System.out.println("Displaying Stack List after pushing Array List Elements: " + StackList);
    }
}
