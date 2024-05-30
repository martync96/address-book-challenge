package org.example.classes;

import org.jetbrains.annotations.NotNull;

public class Contact {

    private int ID;
    private static int nextId = 1;
    private String name;
    private long phoneNumber;
    private String email;

    public Contact(String name, long phoneNumber, String email) throws Exception {
        validateString(name);
        validateString(email);
        validateNumber(phoneNumber);

        ID += nextId++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void validateString(String string) throws Exception {
        if(string.isEmpty() || string.trim().isEmpty()){
            throw new Exception("Property cannot be null");
        }
    }

    public static void validateNumber(long number) throws Exception {
        long numberLength = Long.toString(number).length();
        if(numberLength != 11){
            throw new Exception("The phone number must be 11 digits long");
        }
    }
}
