package friends;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Friends {

    public static void main(String[] args) {
        
        Friend p1 = new Friend();
        Friend p2 = new Friend();
        Friend p3 = new Friend();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first person's name: ");
        String name1 = scanner.next();
        System.out.println("Enter first person's age: ");
        int age1 = scanner.nextInt();
        System.out.println("First person's name is " + name1 + " and he's " + age1+ " years old.");
        
        System.out.println("Enter second person's name: ");
        String name2 = scanner.next();
        System.out.println("Enter second person's age: ");
        int age2 = scanner.nextInt();
        System.out.println("Second person's name is " + name2 + " and he's " + age2+ " years old.");
        
        System.out.println("Enter third person's name: ");
        String name3 = scanner.next();
        System.out.println("Enter third person's age: ");
        int age3 = scanner.nextInt();
        System.out.println("Third person's name is " + name3 + " and he's " + age3+ " years old.");
        
        p1.setName(name1);
        p1.setAge(age1);
        p2.setName(name2);
        p2.setAge(age2);
        p3.setName(name3);
        p3.setAge(age3);
        
        int ageInFuture1 = p1.AgeIn2040();
        System.out.println(name1 + " will be " + ageInFuture1+ "in 2040");
        int ageInPast = p1.ageInPast();
        System.out.println(name1 + "was " + ageInPast + " in 1970.");
        int ageInFuture2 = p2.AgeIn2040();
        System.out.println(name2 + " will be " + ageInFuture2+ "in 2040");
        int ageInFuture3 = p1.AgeIn2040();
        System.out.println(name3 + " will be " + ageInFuture3+ "in 2040");
        
        
        
    }
    
}
