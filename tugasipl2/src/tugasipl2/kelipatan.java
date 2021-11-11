package Tugasipl2;
import java.io.*;
/**
 *
 * @author muhammad fikri indriansyah 3411191057 DSE B
 */

 


public class kelipatan {

    static int findSum(int n, int a, int b){
        int sum = 0;
        for (int i = 0; i < n; i++)
 
           
            if (i % a == 0 || i % b == 0)
                sum += i;
 
        return sum;
    }
    public static void main(String[] args){
        int n = 1000, a = 3, b = 5;
        System.out.println(findSum(n, a, b));
    }
}



   


    

