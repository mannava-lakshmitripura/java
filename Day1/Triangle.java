import java.util.Scanner;
public class Triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int area;
        area=(base*height)/2;
        System.out.println(area);
    }
}