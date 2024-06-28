package emailGenerator;

public class EmailApp
{
   public static void main(String[] args)
   {
      Email email = new Email("Abdulrahman", "Kafafy", 10);
      email.setMailboxCapacity(500);
      email.setAlternateEmail("kafafyyy@example.com");
      email.printUserInfo();

   }
}


