/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
	/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author m307user
*/
public class InsertionSort {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int[] numbers = {13,2,5,11,36,9};
try{
//Printing out the original order of the array
System.out.println("Original Array: ");
for(int i = 0; 1<=numbers.length; i++) {
System.out.print(numbers[i]+"\t");
}
}
catch(Exception e) {
}
System.out.println("");
try{
//Executing the sorting method
sort(numbers);
//Printing out the sorted orderof the array
System.out.println("Sorted Array: ");
printArray (numbers);
}
catch(Exception e) {
}
}
public static int[] sort (int[] A) {
for (int i=1; i<A.length; i++) {
int key =A[i];
int j = i-1;
while(j>=0 && A[j]>key){
A[j+1] = A[j];
j--;
}
A[j+1] = key;
}
return A;
}
public static void printArray(int[] A) {
for(int i = 0; i<=A.length; i++) {
System.out.println(A[i]+"\t");
}
}
}