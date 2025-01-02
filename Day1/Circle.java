import java.util.Scanner;
public class Circle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        float circumference;
        float area;
        circumference= 2*(22/7)*radius;
        area=(22/7)*radius*radius;
        System.out.println(circumference);
        System.out.println(area);

    }
}