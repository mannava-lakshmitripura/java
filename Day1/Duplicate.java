import java.util.Scanner;
public class Duplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        int[] temp=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int duplicate=0;
            for(int j=0;j<t;j++){
                if(num[i]==num[j]){
                    duplicate=1;
                    break;
                }
            }

            if(duplicate==0){
                temp[i]=num[i];
                t++;
            }



        }
        for(int i=0;i<t;i++){
            System.out.print(temp[i]+" ");
        }

        
    }
}