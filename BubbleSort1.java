
package bubblesort1;


public class BubbleSort1 {

    void bubblesort(int a[]){
        int n=a.length;
        for(int i=0; i<n-1; i++)
        {
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j] >a[j+1])
               {
                   int flag=a[j];
                   a[j]=a[j+1];
                   a[j+1]=flag;
                   
               }
           }
        }
    }
    void printArray(int x[])
    {
        int n=x.length;
        for(int i=0;i<n;++i)
        {
            System.out.println(x[i]+"");
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
     BubbleSort1 k= new BubbleSort1();
     int array[]={14,98,6,0,4};
     k.bubblesort(array);
     System.out.println("Sorted arrays");
     k.printArray(array);
    }
    
}
