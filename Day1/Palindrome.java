import java.util.Scanner;
import java.io.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch;
        String reverse="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch + reverse;
            
        }
        
        if(reverse.equals(str)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }


    }
}