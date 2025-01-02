import java.util.*;
public class Trafficlight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String trafficlight=sc.nextLine();
        boolean obstacle=sc.nextBoolean();
        if(obstacle==true){
            System.out.println("Don't move there is an Obstacle");
        }
    
        else if(trafficlight.equals("Green")){
                System.out.println("Go");
            }
        else if(trafficlight.equals("Yellow")){
                System.out.println("Slow Down");
            }
        else if(trafficlight.equals("Red")){
                System.out.println("Stop");
            }
        else{
                System.out.println("invalid traffic light");
            }
        }
    }
