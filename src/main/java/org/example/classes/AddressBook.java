package org.example.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AddressBook {

    private int Id;
    private static int nextId = 1;
    private String username;
    private ArrayList<Contact> contactList;

    public AddressBook(int Id, String username) {
        this.Id = nextId++;
        this.username = username;
        this.contactList = new ArrayList<>();
    }

    ;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact newContact) throws Exception {
        contactList.add(newContact);
    }

    public boolean removeContact(Contact contact) {
            return contactList.remove(contact);
    }

//    public Contact searchForContact(String name) throws Exception {
//        return contactList.stream().filter(contact -> Objects.equals(contact.getName(), name))
//                .findFirst()
//                .orElseThrow(() -> new Exception("Contact not found"));
//    }

    public List<Contact> searchForContact(String name) throws Exception {
        List<Contact> foundContacts = contactList.stream()
                .filter(contact -> Objects.equals(contact.getName(), name))
                .collect(Collectors.toList());

        if (foundContacts.isEmpty()) {
            throw new Exception("No contacts found with the name: " + name);
        }

        return foundContacts;
    }

    public boolean checkForDuplicatePhoneNumber(long number) {
        return contactList.stream().anyMatch(contact -> Objects.equals(contact.getPhoneNumber(), number));
    }

    public boolean checkForDuplicateEmailAddress(String email) {
        return contactList.stream().anyMatch(contact -> Objects.equals(contact.getEmail(), email));
    }

    public List<String> printContacts() {
        return contactList.stream()
                .map(contact -> {
                    StringBuilder contactPrint = new StringBuilder();
                    contactPrint.append("Contact: ").append(contact.getName()).append("\n")
                            .append("Phone number: ").append(contact.getPhoneNumber()).append("\n")
                            .append("Email: ").append(contact.getEmail()).append("\n");
                    return contactPrint.toString();
                })
                .collect(Collectors.toList());
    }

    public Contact searchByNumber(long number) throws Exception{
        return contactList.stream().filter(contact -> Objects.equals(contact.getPhoneNumber(), number))
                .findFirst()
                .orElseThrow(() -> new Exception("Contact not found"));
    }

}

