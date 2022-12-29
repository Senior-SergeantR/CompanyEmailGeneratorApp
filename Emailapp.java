package EmailApp;

public class Emailapp {
    public static void main(String[] args) {
    Email Em1= new Email("Rabin","Otieno");

    Em1.changePassword("645145132");
    Em1.setAlternateEmail("rabinotieno@gmail.com");
        System.out.println(Em1.showInfo());
    }
}
