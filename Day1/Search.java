import java.util.Scanner;
public class Search{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] num=new int[10];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
      System.out.println("enter the element to search");
      int a=sc.nextInt();
      int temp=0;
      for(int i=0;i<n;i++){
        if(num[i]==a){
            temp=i;
        }

      
      }
      System.out.println("the element is found at "+temp+" position");
}
}