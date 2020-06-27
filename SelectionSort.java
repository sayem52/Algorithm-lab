/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;
public class SelectionSort {

    public static void main(String[] args) {
       int size,i,j,temp;
       int array[]=new int[50];
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Array size: ");
       size=scan.nextInt();
       System.out.println("Enter Array elements: ");
       for(i=0;i<size; i++){
           array[i]=scan.nextInt();
           
       }
       System.out.println("sorting use selection sort ");
       for(i=0;i<size;i++){
        for(j=i+1;j<size;j++){
            if(array[i]>array[j])
            {temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            }
        }
    }
       
    }
    
}
