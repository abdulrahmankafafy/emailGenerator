# Email Generator

This project is a simple email generator that creates an email address, department, and random password for a user based on their first name, last name, and department.

## Features

- Generate an email address based on the user's first and last name.
- Set the user's department.
- Generate a random password.
- Print all user information.

## Usage

1. Create an instance of the `Email` class.
2. Set the mailbox capacity and alternate email if needed.
3. Print the user's information.

### Example

```java
public class Main {
    public static void main(String[] args) {
        Email email = new Email("Abdulrahman", "Kafafy", 10);
        email.setMailboxCapacity(500); // Set mailbox capacity
        email.setAlternateEmail("hi@example.com"); // Set alternate email
        email.printUserInfo(); // Print all user's information
    }
}
