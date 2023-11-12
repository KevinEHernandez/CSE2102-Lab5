package com.example.demo.Email.model;

public class Email {
    private String emailAddress;
    private boolean isValid;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        this.isValid = validateEmail(emailAddress);
    }

    public boolean isValid() {
        return isValid;
    }

    private boolean validateEmail(String email) {
        // Dummy email validation - Check if email contains '@' and '.'
        return email != null && email.contains("@") && email.contains(".");
    }
}
