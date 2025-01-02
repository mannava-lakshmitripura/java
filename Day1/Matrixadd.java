import java.util.Scanner;
public class Matrixadd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] num=new int[n][m];
        int[][] arr=new int[n][m];
        int[][] sum=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=num[i][j]+arr[i][j];
            }
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.println(sum[i][j]);
        }
       }

    }
}