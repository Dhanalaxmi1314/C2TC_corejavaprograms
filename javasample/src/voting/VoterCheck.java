package voting;

//File: VoterCheck.java

import java.util.Scanner;

public class VoterCheck {
 
 // Method to check voter eligibility
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age " + age + " is too young. You must be at least 18 to vote.");
     } else if (age > 120) {
         throw new InvalidAgeException("Age " + age + " seems invalid. Please enter a realistic age.");
     } else {
         System.out.println("✅ You are eligible to vote!");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter your age: ");
         int age = sc.nextInt();

         // Call method that may throw custom exception
         checkAge(age);

     } catch (InvalidAgeException e) {
         System.out.println("❌ Exception Caught: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("⚠ Invalid input! Please enter a valid number.");
     } finally {
         sc.close();
     }
 }
}

