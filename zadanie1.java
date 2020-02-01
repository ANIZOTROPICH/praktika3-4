
package praktika2;
import java.lang.Math;
import java.util.Scanner;
public class zadanie1 {

	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite kol-vo chisel massiva");
		int p=in.nextInt();

		int numbers[]=new int[p];
		System.out.println("Vvedite "+ p +" chisel");
		for (int i = 0; i < numbers.length; i++) {
		numbers[i] = in.nextInt();
		int max = numbers[0];
		      	 for (int i1 = 1; i1 < numbers.length; i1++) {
		         if (numbers[i1] > max) max = numbers[i1];
		      }
		      System.out.println("Max: " + max);
		      int min = numbers[0];
		       for (int i1 = 1; i1 < numbers.length; i1++) {
		         if (numbers[i1] < min) min = numbers[i1];
		      }
		      System.out.println("Min: " + min);      
		System.out.println(max-min);
		for (int i1 = 0; i1 < numbers.length; i1++) {
		numbers[i]=Math.abs(numbers[i]);
		double average = 0;
		if (numbers.length > 0)
		{
		    double sum = 0;
		    for (int j = 0; j < numbers.length; j++) {
		         sum += numbers[j];
		    }
		    average = sum / numbers.length;}
		System.out.println("Avg=" + average);
		
		
		}
}
}}
