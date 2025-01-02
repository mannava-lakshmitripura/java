import java.util.Scanner;
public class MaxMin{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] num=new int[10];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int temp=num[0];
        int t=num[0];
        for(int i=0;i<n;i++){
            if(num[i]>temp){
                temp=num[i];
            }
        }
        System.out.println("max:"+ temp);
        for(int j=0;j<n;j++){
            if(num[j]<t){
                t=num[j];
            }
        }
        System.out.println("min:"+t);
    }
}