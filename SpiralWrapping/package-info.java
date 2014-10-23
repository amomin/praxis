/** 
 * @author user
 *
 * http://programmingpraxis.com/2014/10/14/spiral-wrapping/
 * 
 * Today’s exercise appears regularly on lists of interview 
 * questions. We’ve done something similar in the past, but 
 * since it’s so common we’ll do it again.
 *
 *  Given a matrix, print a list of elements of 
 *  the matrix. Start in the 
 *  top-right corner of the matrix, move 
 *  left across the top row, then down the left 
 *  column, then across the bottom row, then 
 *  up the right column to the element below the top row, 
 *  then left, then down, then right, and so on, 
 *  collecting the elements of the matrix as it goes. 
 *  For instance, with this matrix
 *    1  2  3  4
 *     5  6  7  8
 *     9 10 11 12
 *    13 14 15 16
 *   17 18 19 20
 * the elements are collected in order 4, 3, 2, 1, 5, 9
 * , 13, 17, 18, 19, 20, 16, 12, 8, 7, 6, 10, 14, 15, 11.

 * Your task is to write a program to unwrap the 
 * elements of a matrix in the indicated spiral
 * . When you are finished, you are welcome 
 * to read or run a suggested solution, or to 
 * post your own solution or discuss the exercise in the 
 * comments below.
 */
package SpiralWrapping;