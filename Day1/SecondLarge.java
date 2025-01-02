import java.util.Scanner;
public class SecondLarge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int temp=num[0];
        int t=num[0];
        for(int i=0;i<n;i++){
            if(num[i]>temp){
                temp=num[i];
            }
            if(num[i]>t&&num[i]!=temp){
                t=num[i];
            }


        }

       System.out.println("second largest element"+t);
    }
}