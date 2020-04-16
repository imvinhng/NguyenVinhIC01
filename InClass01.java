import java.io.*;
import java.util.*;

public class InClass01 {
   public static void main(String[] args) throws IOException {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      Scanner input = new Scanner(new File("Numbers.txt"));
      while (input.hasNextInt()) {
      int n = input.nextInt();
      numbers.add(n);   
      }
      System.out.println(numbers);
         printwithcount(numbers);
         average(numbers);
         maxmin(numbers);
      filterEvens(numbers);
      System.out.println(numbers);
   }
   
   public static void printwithcount(ArrayList<Integer> list){
   for (int i=0; i<list.size(); i++) {
         System.out.print(i+1+". ");
         System.out.println(list.get(i));
      }

   }
   public static void average(ArrayList<Integer> list){
      int total=0;
      int aver=0;
      for (int i=0; i<list.size(); i++) {
         total+= list.get(i);
      }
      aver = total/list.size();  
      System.out.println("Average: "+aver);
   }
   public static void maxmin(ArrayList<Integer> list){
      int max=list.get(0);
      int min=list.get(0);
      for (int i=1; i<list.size(); i++) {
         if(max<list.get(i)){
         max = list.get(i);
         }
         if(min>list.get(i)){
         min = list.get(i);
         }
      }
      System.out.println("Max: "+max);
      System.out.println("Min: "+min);
   }
   public static void filterEvens(ArrayList<Integer> list) {
    for (int i = list.size() -1 ; i >= 0; i--) {
        int n = list.get(i);
        if (n % 2 == 0) {
            list.remove(i);
        }
    }
    }
}