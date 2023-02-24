package midtermexam_versiona_extensioncode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kojo
 */
import java.util.Scanner;

public class TestUserprofile {
   public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
     
    String arr[]  = {"Comedy", "Drama", "Action", "Mystery"};
    
    System.out.println("Enter your name: ");
    String name = scan.nextLine();
       
    
    System.out.println("Choose your favourite genre: " + arr ); 
    
    String genreanswer = scan.nextLine();
    
    System.out.println("user profile was created");
    
   }
    
    
    
}
