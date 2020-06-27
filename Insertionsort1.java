
package insertionsort1;

import java.util.Arrays;


public class Insertionsort1 {
void insertionSort(int array[])
{
    int size=array.length;
    for(int i =1;i <size;i++){
        int key=array[i];
        int j=i-1;
        while(j>=0 &&key<array[j]){
            array[j+1]=array[j];
            --j;
            
        }
        array[j+1]=key;
    }
}
    public static void main(String[] args) {
        int[]data={4,7,2,55,3};
        Insertionsort1 s=new Insertionsort1();
        s.insertionSort(data);
        System.out.println("Sorted Ascending order: ");
          System.out.println(Arrays.toString(data));
        
        
       
    }
    
}
