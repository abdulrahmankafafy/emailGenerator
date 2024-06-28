package emailGenerator;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email;
    private int mailboxCapacity, defaultPasswordLength;

    // Constructor to receive the name
    public Email(String firstName, String lastName, int DPL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(DPL);
        this.email = firstName.toLowerCase() +  lastName.toLowerCase() + "@" + this.department + ".com";
    }

    // Ask for the department
    public String setDepartment() {
        System.out.println("Enter the department name: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    // Generate a random password
    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Method to print all user's information
    public void printUserInfo() {
        System.out.println("User Information:");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Mailbox Capacity: " + this.mailboxCapacity + "mb");
        System.out.println("Alternate Email: " + this.alternateEmail);
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Getter for mailboxCapacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Setter for mailboxCapacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Getter for alternateEmail
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Setter for alternateEmail
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
}
