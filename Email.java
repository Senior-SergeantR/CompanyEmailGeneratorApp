package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {

   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int defaultPasswordLength =10;
   private int mailBoxCapacity= 1000;
   private String alternateEmail;
   private String companySuffix= "omaera.com";

    /**
     * stores name of the new worker
     * @param firstName
     * @param lastName
     */
// constructor to receive first name and last name
public Email(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    System.out.println("Email Created: "+this.firstName+" "+this.lastName);

    // call a method asking for the department
    this.department= setDepartment();
    System.out.println("Your Department is: "+ this.department);

    // call a method that generates a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your Password is: "+this.password);

    // combine elements to generate email
    email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    System.out.println("Your Company email is: "+email);
}

//ask for the department
    private String setDepartment(){
        System.out.print("Departmental Codes\n 1. Sales \n 2. Development \n 3. Accounting\n 4. None\n Enter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1){
            return "sales";
        }else if(depChoice ==2){
            return "dev";
        }else if(depChoice ==3){
            return "acct";
        }else{
            return "";

        }


}

    private String randomPassword(int length){
    String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789|*&^%$#~";
    char[] password = new char[length];

    for (int i = 0; i<length;i++){
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
    this.mailBoxCapacity = capacity;
    }

    //set alternative email
    public void setAlternateEmail(String altEmail){
     this.alternateEmail= altEmail;
    }

    // change password
    public void  changePassword(String changePass){
    this.password = changePass;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
    return alternateEmail;
    }

    public String getPassword(){
    return password;
    }

    public String showInfo(){
     return "====================================================" +
             "\nName: " +firstName+" "+lastName+
             "\nDepartment: "+ department+
             "\nCompany Email: "+email+
             "\nMail Box Capacity: "+ mailBoxCapacity+ "Mb";

    }


}