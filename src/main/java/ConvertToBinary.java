/*
Problem - Given a non-negative integer n, write a function toBinary/ToBinary
which returns that number in a binary format.

to_binary(1)   should return 1
to_binary(5)   should return 101
to_binary(11)  should return 1011
 */

public class ConvertToBinary {

    public static int toBinary(int n) {
        return Integer.valueOf(Integer.toBinaryString(n));
    }
}

// How do you swap two integers without using a temporary variable?
//  array, linked list, string, binary tree, as well as questions from algorithms (e.g. string algorithm, sorting algorithms like quicksort or radix sort, and other miscellaneous ones
//reversing an array, sorting the array, or searching elements on the array.
// loop, recursion, and fundamental operators.

/*
How do you find the missing number in a given integer array of 1 to 100? (solution)
How do you find the duplicate number on a given integer array? (solution)
How do you find the largest and smallest number in an unsorted integer array? (solution)
How do you find all pairs of an integer array whose sum is equal to a given number? (solution)
How do you find duplicate numbers in an array if it contains multiple duplicates? (solution)
How are duplicates removed from a given array in Java? (solution)
How is an integer array sorted in place using the quicksort algorithm? (solution)
How do you remove duplicates from an array in place? (solution)
How do you reverse an array in place in Java? (solution)
How are duplicates removed from an array without using any library? (solution)
 */
