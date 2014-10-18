/** Thue Morse sequence.
 * 
 * The task is to compute the nth term of the Thue-Morse sequence.
 * 
 * The Thue Morse sequence is defined as follows:
 * 
 * Start with 0.
 * 
 * Conitnue the sequence by appending the binary complement of the 
 * sequence constructed so far to the end.
 * 
 * i.e.
 * 0
 * 01
 * 0110
 * 01101001
 * 0110100110010110
 * etc...
 * 
 * Should be something like the parity of non-zero bits of x.  Not difficult to prove by induction:
 * 
 * Suppose x is 2^n <= x < 2^(n+1), write x = 2^n + k
 * 
 * By definition of the sequence it is clear that t(x) = complement of p(k) = (p(k) + 1) % 2.
 * 
 * But this is the same as the (parity of the) non-zero bits of x, since x has the same binary digits as k except for an 
 * extra 1 in the nth digit.
 * 
 * @author user
 *
 */
package ThueMorse;