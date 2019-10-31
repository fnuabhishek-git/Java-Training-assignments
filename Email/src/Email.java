public class Email {
    String to;
    String CC;
    String subject;
    String body;

    private static Email email = null;

    public String text;
    private Email(){
        text = "this is test";
    }

    public static Email getInstance(){
        if(email == null)
            email = new Email();

            return email;
    }
}
