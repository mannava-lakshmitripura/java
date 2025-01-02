import java.util.*;
public class Vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean citizen=sc.nextBoolean();
        if(age>=18 && citizen==true){
            System.out.println("the person can vote");
        }
        else{
            System.out.println("the person cannot vote");
        }

    }
}