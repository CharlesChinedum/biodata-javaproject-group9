/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*GROUP 9
/*COS 201
/*PROJECT TOPIC: Develop a program that asks users self based questions.This is like a bio
data program.
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package  com.group9.biodatagroup9javaproject;
/**
*
* @author Clare
*/
import java.util.Scanner;
public class BioDataGroup9JavaProject {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // BioData code application logic here
 
 String firstName;
 String surname;
 String middleName;
 String department;

 int level;
 int age;
 long phoneNumber;
 char gender;
 
 Scanner GroupNine = new Scanner(System.in);
 
 System.out.println(" WELCOME TO UNIVERSITY OF NIGERIA NSUKKA, STUDENT PORTAL: ");
 System.out.println(" FILL IN STUDENT BIO DATA INFORMATION ");
 
 System.out.println(" First Name: ");
 firstName = GroupNine.nextLine();
 
 System.out.println(" Surname : ");
 surname = GroupNine.nextLine();
 
 System.out.println(" Middle Name: ");
 middleName = GroupNine.nextLine();
 
 System.out.println(" Department: ");
 department = GroupNine.nextLine();
 
 System.out.println(" Level: ");
 level=GroupNine.nextInt();
 
 System.out.println(" Student Age: ");
 age=GroupNine.nextInt();
 
 System.out.println(" Phone Number: ");
 phoneNumber = GroupNine.nextLong();
 

 
 System.out.println(" Enter Gender (M/m or F/f): ");
 gender=GroupNine.next().charAt(0);
 switch (gender){
 case 'M':
 case 'm':
 System.out.printf("Male.");
 break;
 case 'F':
 case 'f':
 System.out.printf("Female.");
 break;
 default:
 System.out.printf("Unspecified gender.");
 }
 System.out.printf("\n");
 
   System.out.println("Hello " + surname + " " + firstName + " " + middleName);
   System.out.println("You are a " + level +  "L student of " + department);
   System.out.println("You are " + age + " years old");
   System.out.println("Your phone number is: " + phoneNumber);
   System.out.println("Your are a " + gender);
   
 } 

}
