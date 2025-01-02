import java.util.Scanner;
public class Arrrotation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){

            num[i]=sc.nextInt();
        }
        if(a==0){
            for(int i=0;i<n;i++){
                System.out.println(num[i]);
            }
        }
        int[] temp=new int[n];
        for(int i=0;i<a;i++){
            temp[i]=num[i];
        }
        for(int i=0;i<n-a;i++){
            num[i]=num[i+a];
        }
        for(int i=0;i<a;i++){
            num[n-a+i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }

    }
    
}