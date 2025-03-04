package com.Mariam.password;

public interface UserInterface {
    public int getPasswordLength();
    public boolean userLowercase();
    public boolean useUppercase();
    public boolean useNumbers();
    public boolean useSymbols();
    public void displayPassword(String password);
}
