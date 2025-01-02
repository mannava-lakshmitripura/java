import java.util.Scanner;
public class SumAvg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] num=new int[n];
       for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
       }

       int sum=0;
       for(int i=0;i<n;i++){
        sum=sum+num[i];
       }
       float avg=sum/n;
       System.out.println("Sum:"+sum);
       System.out.println("Avg:"+avg);


    }
}