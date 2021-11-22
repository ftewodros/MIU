package training3;

public class EmailAddress {
    private  int type;
    public String emailAddress;

    public EmailAddress() {
        this.type = 0;
        this.emailAddress = "mitugashe@gmail.com";
    }

    public EmailAddress(int type, String emailAddress) {
        this.type = type;
        this.emailAddress = emailAddress;
    }
}
