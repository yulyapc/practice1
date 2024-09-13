package single.responsibility;

public class Email {
    public void sendEmail(User user, String subject, String message, String recipientEmail) {
        System.out.println("From: " + user.getEmail());
        System.out.println("To: " + recipientEmail);
        System.out.println("Subject: " + subject);
        System.out.println(message);
        System.out.println("Regards");
        System.out.println(user.getUser());
    }
}
