package model;

public class Mail {
    
    private final String mail;
    
    public Mail(String mail){
        this.mail=mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        String[] splitted = this.mail.split("@");
        return splitted[1];
    }
    
}
