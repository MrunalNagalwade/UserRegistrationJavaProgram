package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args)
    {
        //User firstname validation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Firstname");
        String firstname = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstname);
        boolean matches = matcher.find();

        if (matches)
            System.out.println("Valid firstname");
        else
            System.out.println("Please Enter Valid First Name");
        //For lastname
        System.out.println("Enter Last Name-");
        String lastName = scanner.next();
        Pattern pattern_lastName = Pattern.compile("[A-Z]{1}[a-z]");
        Matcher matcher_lastName = pattern_lastName.matcher(lastName);
        boolean matches_lastName = matcher_lastName.find();
        if (matches_lastName)
            System.out.println("Lastname is valid");
        else
            System.out.println("Lastname is InValid");

    }

}
