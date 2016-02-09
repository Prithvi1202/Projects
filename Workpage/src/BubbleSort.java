
public class BubbleSort{
 public static void main(String[] args)
 {
   
   for (String str: args) {
     System.out.println(str);
   }
 

   int i;
  int array[] = new int[args.length];
for(int j=0; j<args.length; j++)array[j] = Integer.parseInt(args[j]);


 //  int array[] = {5, 10, 297, 3, 18, 4, 5};
   
   for(i = 0; i < array.length; i++)
     System.out.print( array[i]+"  ");
   System.out.println();
   bubbleSort(array, array.length);
   
   for(i = 0; i < array.length; i++)
     System.out.print(array[i]+"  ");
   System.out.println();
  }
 
 public static void bubbleSort( int a[], int n ){
 int i, j,t=0;
 for(i = 0; i < n; i++){
 
   for(j = 1; j < (n-i); j++){
     if(a[j-1] > a[j]){
       t = a[j-1];
       a[j-1]=a[j];
       a[j]=t;
 }
 }
 }
 }
}
