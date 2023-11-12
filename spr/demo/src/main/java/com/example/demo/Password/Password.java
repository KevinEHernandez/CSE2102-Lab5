package com.example.demo.Password.model;

public class Password {
    private String passwd;
    private String passwordStrength;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
        this.passwordStrength = evaluatePasswordStrength(passwd);
    }

    public String getPasswordStrength() {
        return passwordStrength;
    }

    private String evaluatePasswordStrength(String password) {
        // Dummy logic for password strength evaluation
        return (password.length() >= 5) ? "Strong" : "Weak";
    }
}
