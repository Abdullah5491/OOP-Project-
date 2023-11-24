public class Accounts {
    private String emailAddress;
    private String ContactNumber;
    private String password;

    public Accounts(String emailAddress, String contactNumber, String password) {
        this.emailAddress = emailAddress;
        ContactNumber = contactNumber;
        this.password = password;
    }

    public Accounts(String contactNumber, String password) {
        ContactNumber = contactNumber;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toString(){
        return "Email Address: "+emailAddress+"\nContact Number: "+ContactNumber+"\nPassword: "+password;
    }
}
