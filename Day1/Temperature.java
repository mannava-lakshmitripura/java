import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float cel=sc.nextFloat();
        float far=sc.nextFloat();
        float cel_to_far=cel*(9/5)+32;
        float far_to_cel=(far-32)*(5/9);
        System.out.println("celsius to fahrenheit "+cel_to_far);
        System.out.println("fahrenheit to celsius "+ far_to_cel);
    }
}