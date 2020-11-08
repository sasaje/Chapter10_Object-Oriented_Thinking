/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 08/11/2020
 *
 */

package Assignment10_10;

/*
 *  Design a class named Queue for storing integers.
 *  An int[] data fields named elements that stores the int values in the queue.
 *  A data field named size that stores the number og elements in the queue.
 *  A constructor that creates a Queue object with default capacity 8.
 *  The method enqueue(int v) that adds v into the queue.
 *  The method dequeue() that removes and returns the element from the queue.
 *  The empty() that returns true if the queue is empty.
 *  The method getSize() that returns the size of the queue.
 */

/* ************************************ */
/*                Queue                 */
/* ------------------------------------ */
/*  - int[] elements                    */
/*  - int size                          */
/*  + int[] emptyArray                  */
/* ------------------------------------ */
/*  + Queue(int[] : elements)           */
/*  + enqueue(v : int) : void           */
/*  + dequeue(v : int) : void           */
/*  + empty() : boolean                 */
/*  + getSize(size : int) : int         */
/* ************************************ */


import java.util.Arrays;
import java.util.stream.IntStream;

public class Queue {
    static private int [] myArray = {1,2,3,4,5,6,7,8};
    private int size = myArray.length;

    public static int[] getArray() {
        return myArray;
    }
    public int getSize() {
        return size;
    }

    static int[] emptyArray = {};

    // A constructor that creates a Queue object with default capacity 8.
    Queue(int[] elements){
        int[] defaultQueue = new int[8];
    }

    public static void main(String[] args) {
        // print added element to myArray
        System.out.println(Arrays.toString(getArray()));
        Queue newElement = new Queue(myArray);
        System.out.println(Arrays.toString(newElement.enqueue(5))); // prints the destArray with the new element 5.

        // Remove element from myArray
        int v = 2;  // Get the specific index

        // Print the index
        System.out.println("Index["+ v + "] to be removed");

        // Remove the element
        myArray = dequeue(v);

        // Print the new array
        System.out.println("New Array after remove of index["+v+"]: " + Arrays.toString(myArray));

        System.out.println("");

        //show if the array is empty:
        Queue queue = new Queue(myArray);
        Queue queue1 = new Queue(emptyArray);

        queue.empty(myArray);
        queue1.empty(emptyArray);

    }

     // The method enqueue(int v) that adds v into the queue.
    public int[] enqueue(int v){
        int[] destArray = new int[myArray.length+1]; //create new array

        // copy all the current elements from myArray to destArray.
        for (int i = 0; i < myArray.length; i++) {
            destArray[i] = myArray[i];
        }

        destArray[destArray.length-1] = v; //add the element of v to the new array destArray.
        return destArray;
    }


    // Function to remove the element
    public static int[] dequeue(int v){
        // If the array is empty or the index is not in array range return the original array
        if (myArray == null
                || v < 0
                || v >= myArray.length) {

            return myArray;
        }

        // return the new array
        return IntStream.range(0, myArray.length)
                .filter(i -> i != v)
                .map(i -> myArray[i])
                .toArray();
    }

    public void empty(int[] elements){
        if(elements.length == 0)
            System.out.println("array empty");
        else
            System.out.println("array not empty");
    }
}