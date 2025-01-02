import java.util.Scanner;
public class Merge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        int[] arr=new int[n];
        int[] mer=new int[num.length+arr.length];
        int m=mer.length;
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
           
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            mer[i]=num[i];
        }
        for(int i=0;i<n;i++){
            mer[num.length+i]=arr[i];
        }
        for(int i=0;i<m;i++){
            System.out.print(mer[i]+" ");
        }
        System.out.println("Sort:");
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(mer[i]>mer[j]){
                    temp=mer[i];
                    mer[i]=mer[j];
                    mer[j]=temp;
                }
            }
        System.out.print(mer[i]+"  ");
        }
        

    }
}