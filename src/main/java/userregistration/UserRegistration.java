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
        //for valid email
        System.out.println("Enter Email-");
        String email = scanner.next();
        Pattern pattern_email = Pattern.compile(
                "^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$");
        Matcher matcher_email = pattern_email.matcher(email);
        boolean matches_email = matcher_email.find();
        if (matches_email)
            System.out.println("Its Valid Email");
        else
            System.out.println("Its InValid Email");
        //FOR MOBILE NUMBER
        System.out.println("Enter Mobile Number-");
        String mobileNumber = scanner.next();
        Pattern pattern_mobileNumber = Pattern.compile("^[0-9]{2}[ ][7,8,9]{1,1}[0-9]{9}$");
        Matcher matcher_mobileNumber = pattern_mobileNumber.matcher(mobileNumber);
        boolean matches_mobileNumber = matcher_mobileNumber.find();
        if (matches_mobileNumber)
            System.out.println("Its Valid Mobile Number");
        else
            System.out.println("Its InValid Mobile Number");
        //For Password

        System.out.println("Enter Password");
        String password = scanner.next();
        Pattern pattern_password = Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matcher_password = pattern_password.matcher(password);
        boolean matches_password = matcher_password.find();
        if (matches_password)
            System.out.println("Valid password");
        else
            System.out.println("InValid password");
        //password check for uppercase
        System.out.println("Enter Password Using atleast single uppercase");
        String password1 = scanner.next();
        Pattern pattern_password1 = Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matcher_password1 = pattern_password1.matcher(password1);
        boolean matches_password1 = matcher_password1.find();
        if (matches_password1)
            System.out.println("Valid password");
        else
            System.out.println("InValid password");
        //For Numeric Password

        System.out.println("Enter Password as numeric used");
        String passwords = scanner.next();
        Pattern pattern_passwords = Pattern.compile("^(.*[A-Z]+[0-9]+[A-Za-z0-9]{6,})$");
        Matcher matcher_passwords = pattern_passwords.matcher(passwords);
        boolean matches_passwords = matcher_passwords.find();
        if (matches_passwords)
            System.out.println("Valid password");
        else
            System.out.println("InValid password");
        //For Special character Password

        System.out.println("Enter Password as character used");
        String passwords1 = scanner.next();
        Pattern pattern_passwords1 = Pattern.compile("^(.*[A-Z]+.*[0-9]+.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$");
        Matcher matcher_passwords1 = pattern_passwords1.matcher(passwords1);
        boolean matches_passwords1 = matcher_passwords1.find();
        if (matches_passwords1)
            System.out.println("Valid password");
        else
            System.out.println("InValid password");
        

    }

}
