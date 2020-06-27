
package linearsearch;


public class LinearSearch {

   public static int search(int a[],int x){
       int n=a.length;
       for(int i=0;i<n;i++)
       {
           if(a[i]==x)
               return i;
       }
       return 1;
   }
    public static void main(String[] args) {
       int x[]={24,76,90,87};
       int p=87;
       int result = search(x,p);
       if(result==-1)
           System.out.println("not found");
       else
           System.out.println("found at index "+result);
       
    }
    
}
